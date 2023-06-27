package leetcode;

import java.util.Scanner;

public class khubbjae {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int x = scr.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        int q= scr.nextInt();

        for(int i = 0;i<q;i++){
            int f = scr.nextInt();
            if(f==1){
                int l = scr.nextInt();
                int r = scr.nextInt();
                int k = scr.nextInt();
                int flag=0;
                int count = 0;
                for(int j = l-1;j<r;j++){
                    if(arr[j] == x){
                        count++;
                        if(count==k){
                            System.out.println(j+1);
                        }

                        flag = 1;
                    }
                }


                if(flag==0){
                    System.out.println(-1);
                }
            }
            else if(f==2){
                int j = scr.nextInt();
                int v = scr.nextInt();

                arr[j-1]=v;
            }
        }
    }
}
