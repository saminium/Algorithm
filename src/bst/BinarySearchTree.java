package bst;

import com.sun.org.apache.xpath.internal.SourceTreeManager;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by szeru on 12/31/2018
 */
public class BinarySearchTree {

    Node head;

    public void addNode(int val){
        if(head == null){
            head = new Node(val);
            return;
        }

        Node newNode = new Node(val);
        Node parent;
        Node focus = head;
        while(true){
            parent = focus;
            if(val < focus.getVal() ){
                focus = focus.getLeft();
                if(focus == null){
                    parent.setLeft(newNode);
                    break;
                }
            }else{
                focus = focus.getRight();
                if(focus == null){
                    parent.setRight(newNode);
                    break;
                }
            }
        }

    }

   public void printInorder(Node node){
       if (node == null)
           return;

        /* first recur on left child */
       printInorder(node.getLeft());

        /* then print the data of node */
       System.out.print(node.getVal() + " ");

        /* now recur on right child */
       printInorder(node.getRight());
   }

    public static void main(String[] args) {
        int[] ints = {8,9,3,4,6,7, 11, 5, 20, 1};
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i < ints.length; i++){
            bst.addNode(ints[i]);
        }
      bst.printInorder(bst.head);
    }
}
