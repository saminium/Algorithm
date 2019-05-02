package hackerrank.chapter2;

/**
 * Created by szeru on 3/6/2019
 */
public class LinkedList {
    Node head;
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }
    }

    public void addNode(int data){
        Node current = head;
        if(head == null){
            head = new Node(data);
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);

    }
}
