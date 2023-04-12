package LinkedList;

public class moveLastNodeToFront {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(23);
        head.next.next.next = new ListNode(21);
        ListNode ans =solve(head);
        System.out.println(ans);

    }

    static ListNode solve(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy = head;

        while(dummy.next.next!=null){
            dummy= dummy.next;
        }

        int value = dummy.next.val;
        dummy.next=null;
        ListNode ans = new ListNode(value);
        ans.next=head;

        return ans;
    }
}
