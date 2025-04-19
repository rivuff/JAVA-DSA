package CompanyBased.Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfArr {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {10, -12, 2, 5, 3, 15, 17, 21, -3, -4};

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

       prime[0] = false;
       prime[1]  = false;

        for(int i =2;i*i<n;i++){

            if(prime[i]){
                for(int j = 2*i; j<n; j+=i){
                    prime[j] = false;
                }
            }
        }

        int sum =0;
        for(int i =0;i<prime.length;i++){
            if(prime[i] == true){
                sum += arr[i];
            }
        }

        System.out.println(sum);

    }
}
