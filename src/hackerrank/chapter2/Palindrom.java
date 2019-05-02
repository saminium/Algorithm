package hackerrank.chapter2;

import java.util.Random;
import java.util.Stack;

/**
 * Created by szeru on 3/9/2019
 */
public class Palindrom {

    public static boolean isPalindrom(LinkedList list) {

        Stack<Integer> firstHalf = new Stack<>();
        LinkedList.Node fast = list.head;
        LinkedList.Node slow = list.head;

        while (fast != null && fast.next != null) {
            firstHalf.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
        }

        /** check for odd node sizes**/
        if (fast != null) {
            slow = slow.next;

        }
        while (slow != null) {
            int val = firstHalf.pop();
            if(val != slow.data ){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList notPalList = new LinkedList();
        for(int i = 0; i < 10; i++){
            notPalList.addNode(new Random().nextInt(10));
        }
        isPalindrom(notPalList);
        LinkedList palList = new LinkedList();
        int[] pal = {3,5,6,7,6,5,3};
        for(int i = 0; i < pal.length; i++){
            palList.addNode(pal[i]);
        }

        isPalindrom(palList);
    }
}
