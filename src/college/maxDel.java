package college;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class maxDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            Integer[] arr = new Integer[N];

            for(int i = 0; i< N; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr, Collections.reverseOrder());

            int sum = 0;
            int i = L-1;
            while(i<N){
                sum+=arr[i];
                i+=K;
            }
            System.out.println(sum);
        }

    }
}
