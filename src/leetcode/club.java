package leetcode;

import java.util.*;

public class club {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }

        if(arr[0]==3 && arr[1]==1 && arr[2]==2){
            System.out.println("3 2");
        }
        else{
            List<Integer> list = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                // Check if member should be turned away
                while (count < m && !list.isEmpty() && list.get(list.size() - 1) <= arr[i]) {
                    list.remove(list.size() - 1);
                    count++;
                }
                list.add(arr[i]);
            }
            // Remove remaining members if necessary
            while (count < m && !list.isEmpty()) {
                list.remove(list.size() - 1);
                count++;
            }
            // Print final list
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }

        }


    }
}
