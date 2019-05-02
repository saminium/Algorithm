package bst;

/**
 * Created by szeru on 12/31/2018
 */
public class Node {

    private int val;
    private Node left;
    private Node right;

    public Node(int val){
        this.val = val;
    }

    public Node (Node left, Node right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}
