package KumarK.Hashmap;

import java.util.Scanner;

public class GoodBinaryString {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();

        while(t-->0){
            String str = scr.next();

            char[] arr = new char[str.length()];
            arr = str.toCharArray();

            int cnt1 =0;
            int cnt2 =0;
            for(int i =0;i<str.length()-1;i++){
                String charStr = str.substring(i,i+2);

                if(charStr=="01"){
                    cnt1++;
                }else if(charStr=="10"){
                    cnt2++;
                }
            }
            int ans =0;
            if(cnt1==cnt2){
                ans++;
            }
        }
    }
}
