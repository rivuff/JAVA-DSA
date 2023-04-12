package LinkedList;

import java.util.LinkedList;


public class insertion {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        else if(list2 ==null){
            return list1;
        }

        ListNode dummy = new ListNode();
        ListNode result = dummy;

        while(list1!=null && list2 !=null){
            if(list1.val<= list2.val){
                dummy.next= new ListNode(list1.val);
                list1=list1.next;
            }
            else {
                dummy.next= new ListNode(list2.val);
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        dummy.next = (list1!=null)?list1:list2;

        return result.next;
    }
}
