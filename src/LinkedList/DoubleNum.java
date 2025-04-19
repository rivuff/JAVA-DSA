package LinkedList;

import java.math.BigInteger;

public class DoubleNum {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(9);

        ListNode node = doubleIt(head);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode doubleIt(ListNode head) {
        if(head == null){
            return null;
        }

//        if(head.next==null){
//            return new ListNode(head.val*2);
//        }

        ListNode clone = head;
        //long val = clone.val;
        String str = new String();

        while(clone!=null){
            char a = (char)(clone.val+'0');
            str = str + a;
           // val+=clone.val;
            clone = clone.next;
        }


        //String str = Long.toString(val);

        return convertToDoubledLinkedList(str);


    }

    public static ListNode convertToDoubledLinkedList(String numStr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        for (int i = numStr.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numStr.charAt(i));


            int doubledValue = (digit * 2) + carry;


            carry = doubledValue / 10;
            current.next = new ListNode(doubledValue % 10);
            current = current.next;
        }


        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return reverseList(dummy.next);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


}
