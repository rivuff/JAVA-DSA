package DailyChellange;

import java.util.Arrays;
import java.util.List;

public class splitListNode {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);list.next.next.next.next.next = new ListNode(6);list.next.next.next.next.next.next = new ListNode(7);list.next.next.next.next.next.next.next = new ListNode(8);list.next.next.next.next.next.next.next.next = new ListNode(9);list.next.next.next.next.next.next.next.next.next = new ListNode(10);

        ListNode[] arr = splitListToParts(list, 3);
        System.out.println(Arrays.toString(arr));

    }

    public static ListNode[] splitListToParts(ListNode head, int k) {


          ListNode current = head;
        int n = size(current);

        ListNode[] list = new ListNode[k];
        current = head;

        int y = 0;
        if(n>k){
            y = n/k;
            int a = n%k;

            for(int i=0;i<k;i++){
                int x= y;
                ListNode node = new ListNode();
                if(i>=(k-a)){
                    while(x>=0){
                        if(head!=null){
                            node = head;
                            node = node.next;
                            head = head.next;
                        }
                        x--;
                    }
                }else{
                    while(x>0){
                        if(head!=null){
                            node = head;
                            node = node.next;
                            head = head.next;
                        }
                        x--;
                    }
                }

                list[i] = node;
            }

        }else{

            for(int i =0;i<n;i++){
                if(head!=null){
                    list[i] = head;
                    head = head.next;
                }

            }
        }

        return list;


    }

    public static int size(ListNode head){
        if(head==null){
            return 0;
        }
        int count= 1;
        while(head==null || head.next!=null){
            head = head.next;
            count++;
        }

        return count;
    }
}
