package hackerrank.chapter2;

/**
 * Created by szeru on 3/6/2019
 */
public class PartitionLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head;
        Node current = null;

        public Node getHead() {
            return head;
        }

        public void addNode(int data){

            if(head == null){
                head = new Node(data);
                current = head;
                return;
            }

            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public static Node partitionLinkedList(Node node, int target){
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        Node current = node.next;
        node.next = null;

        while(node != null){
            if(node.data < target){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = node;
                }else{
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }else{
                if(afterStart == null){
                    afterStart = node;
                    afterEnd = node;
                }else{
                    afterEnd.next = node;
                    afterEnd = afterEnd;
                }
            }
            node = current;
        }

        return beforeEnd.next = afterStart;
    }


    public static Node kthNode(LinkedList linkedList, int k){

        Node left = linkedList.head;
        Node right = linkedList.head;

        for(int i = 0; i < k-1; i++){
            if(right == null) {
               return null;
            }
            right = right.next;
        }

        while(right != null){
            right = right.next;
            left = left.next;
        }

        return  left;

    }

    public static void main(String[] args) {
        int[] input = {3, 5, 8, 5, 10, 2, 1};

        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < input.length; i++){
            linkedList.addNode(input[i]);
        }
       // Node node = partitionLinkedList(linkedList.getHead(), 5);

        System.out.println(kthNode(linkedList, 2));

       /* while(node.next != null){
            System.out.println(node.data +" -> ");
            node = node.next;
        }*/
    }
}
