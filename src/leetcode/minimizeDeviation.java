package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class minimizeDeviation {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(minimumDeviation(nums));
    }

    static int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;


        for (int i = 0; i < n; i++) {
            q1.add(nums[i]);
            q2.add(nums[i]);
        }
        int after =q2.peek()-q1.peek();

        while (q2.peek()%2==0 || q1.peek()%2==1){
            if(q1.peek()*2<=q2.peek()/2 && q2.peek()%2==0 && q1.peek()%2==1){
                if (q2.peek()%2==0){
                    int highest = q2.poll()/2;
                    q2.add(highest);
                }
                if (q1.peek()%2==1){
                    int low = q1.poll()*2;
                    q1.add(low);
                }
            }
            else {
                q1.addAll(q2);
                q1.clear();
                if (q2.peek()%2==0){
                    int highest = q2.poll()/2;
                    q1.add(highest);
                }
                if (q1.peek()%2==1){
                    int low = q1.poll()*2;
                    q2.add(low);
                }
            }

            if (after < Math.abs(q2.peek() - q1.peek())) {
                break;
            }
            after = Math.abs(q2.peek()-q1.peek());
        }


        return after;
    }
}
