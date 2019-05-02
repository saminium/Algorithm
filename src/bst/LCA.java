package bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by szeru on 3/17/2019
 */
public class LCA {

    /** find least common ancesstor **/

    public static Queue<Node> pathTo_x(Node head, int x){
        Queue<Node> pathto_x = new LinkedList<>();
        if(head == null) return null;

        Node current = head;
        while(current != null){
            pathto_x.add(current);
            if(current.getVal() < x){
                current = current.getRight();
            }else{
                current = current.getLeft();
            }

        }
     return pathto_x;
    }


    public static Node lca(Node head, int x, int y){
        Node toReturn = null;
        final Queue<Node> pathTo_x = pathTo_x(head, x);
        final Queue<Node> pathTo_y = pathTo_x(head, y);

        if(pathTo_x == null || pathTo_y == null) return null;

        while(!pathTo_x.isEmpty() && !pathTo_y.isEmpty()){
            final Node xStack = pathTo_x.poll();
            final Node yStack = pathTo_y.poll();

            if(xStack.getVal() == yStack.getVal()){
                toReturn = xStack;
            }else{
                return toReturn;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        int[] ints = {8,9,3,4,6,7, 11, 5, 20, 1};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i < ints.length; i++){
            bst.addNode(ints[i]);
        }

        final Node lca = lca(bst.head, 5, 7);
        final Node lca2 = lca(bst.head, 6, 20); //8
        final Node lca3 = lca(bst.head, 1, 4); // 3
        final Node lca4 = lca(bst.head, 4, 3); // 3

        System.out.println(lca2.getVal() + " " + lca3.getVal() + " " + lca3.getVal() + " " + lca4.getVal());

    }

}
