package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(arr[i]%2==0 || arr[i]%3==0 || arr[i]%5==0){
                list.add(arr[i]);
            }
        }

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }


    }


}
