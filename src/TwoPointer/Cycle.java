package TwoPointer;

import java.util.*;

public class Cycle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1,1,4,4,5,5};

        int n = arr.length;

        for(int i =0;i<n;i++){
            list.add(arr[i]);
        }

        System.out.println(minLengthAfterRemovals(list));
    }

    public static int minLengthAfterRemovals(List<Integer> nums) {

        int n = nums.size();
        int i = 0;
        int m = n / 2;
        int count = 0;
        while (i < n / 2 && m < n) {
            if (nums.get(i) < nums.get(m)) {
                i++;
                m++;
                count += 2;
            } else {
                m++;
            }
        }
        return n- count;

    }
}
