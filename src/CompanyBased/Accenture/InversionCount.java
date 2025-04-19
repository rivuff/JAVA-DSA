package CompanyBased.Accenture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scr.nextInt();
        }
        int m = scr.nextInt();
        int[] num = new int[m];
        for(int i =0;i<m;i++){
            num[i] = scr.nextInt();
        }

        int p = scr.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }

        int sum = 0;

        for(int i =0;i<m;i++){
            if(set.contains(num[i])){
                sum+= p * num[i];
                set.remove(num[i]);
            }else {
                sum -= p*num[i];
            }
        }

        System.out.println(sum);

    }
}
