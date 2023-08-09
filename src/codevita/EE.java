package codevita;

import java.util.HashMap;
import java.util.Scanner;

public class EE {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scr = new Scanner(System.in);

        int t= scr.nextInt();

        while(t-->0){
            HashMap<Integer, Integer> map = new HashMap<>();

            int n = scr.nextInt();
            for(int i =0;i<n;i++){
                int a = scr.nextInt();

                map.put(a, map.getOrDefault(a,0)+1);
            }

            int even =0;
            int odd = 0;

            for(int num : map.values()){
                if(num%2==0){
                    even++;
                }else{
                    odd++;
                }
            }

            if(odd>1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
