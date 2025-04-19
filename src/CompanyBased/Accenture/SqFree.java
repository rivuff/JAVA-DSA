package CompanyBased.Accenture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SqFree {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int val = scr.nextInt();
        List<Integer> list = new ArrayList<>();
        int i =2;
        while (true){
            int v =(int)Math.pow(i,2);
            if(v>val){
                break;
            }
            list.add(v);
            i++;
        }

        int count =0;
        for( i=2;i<=val/2;i++){
            if(val%i==0){
               int j =0;
               int flag=0;
               while (list.get(j)<=i){
                   if(i%list.get(j)==0){
                       flag=1;
                       break;
                   }
                   j++;
               }
               if(flag==0){
                   count++;
               }
            }
        }


        System.out.println(count);
    }

}
