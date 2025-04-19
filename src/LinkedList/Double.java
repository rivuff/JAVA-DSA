package LinkedList;

public class Double {
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        node.next = new ListNode(9);
        node.next.next = new ListNode(8);

    }


        public static ListNode convertToDoubledLinkedList(String numStr) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            int carry = 0;

            for (int i = numStr.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(numStr.charAt(i));

                // Double the digit and add carry
                int doubledValue = (digit * 2) + carry;

                // Update carry
                carry = doubledValue / 10;
                current.next = new ListNode(doubledValue % 10);
                current = current.next;
            }

            // If there's a carry left after processing all digits
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

        public static void printLinkedList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

}
