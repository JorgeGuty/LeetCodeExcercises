package AddTwoNumbers;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        boolean finishedL1 = false;
        boolean finishedL2 = false;

        int sum;
        int digit;
        int carry;

        while (true) {
            sum = currentL1.val + currentL2.val;
            digit = sum % 10;
            carry = sum / 10;

            currentL1.val = digit;
            currentL2.val = digit;

            if (isLastNode(currentL1)) finishedL1 = true;
            if (isLastNode(currentL2)) finishedL2 = true;

            if (finishedL1 && finishedL2) break;

            currentL1 = getNext(currentL1);
            currentL2 = getNext(currentL2);

            System.out.println(l1);

            currentL1.val += carry;

        }
        return l1;

    }

    public static ListNode getNext(ListNode pCurrent){
        if (isLastNode(pCurrent)) pCurrent.next = new ListNode(0);
        return pCurrent.next;
    }

    public static boolean isLastNode(ListNode pCurrent){
        return pCurrent.next == null;
    }

    public static ListNode initList(int[] pArray){
        ListNode firstNodePinter = new ListNode();
        ListNode next;
        ListNode current = firstNodePinter;

        for (int index = 0; index < pArray.length ; index++){
            next = new ListNode();
            current.val = pArray[index];
            if (index == pArray.length-1) break;
            current.next = next;
            current = current.next;
        }

        return firstNodePinter;
    }

    public static void main(String[] args) {
        ListNode l1 = initList(new int[]{2,4,3});
        ListNode l2 = initList(new int[]{5, 6, 4});

        System.out.println(addTwoNumbers(l1,l2));

    }
}
