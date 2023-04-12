package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimalFuelCost {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        for(int i =0;i<t;i++){
            String str = "I am :IronnorI Ma, i";

            int z=0;
            StringBuilder newStr= new StringBuilder();
            while (z<str.length()){
                if(((int)(str.charAt(z))>=32 && (int)(str.charAt(z))<=47) || ((int)(str.charAt(z))>=58 && (int)(str.charAt(z))<=64)||((int)(str.charAt(z))>=91 && (int)(str.charAt(z))<=96)||((int)(str.charAt(z))>=123 && (int)(str.charAt(z))<=126) || str.charAt(z)==' '){
                    z++;
                }
                else {
                    char a = Character.toLowerCase(str.charAt(z));
                    newStr.append(a);
                    z++;
                }
            }
            int n = newStr.length();
            char[] ar = new char[n];
            ar = newStr.toString().toCharArray();
            int j =0;
            int k = n-1;

            if(n%2==0){
                while (j<k){
                    if(ar[j]==ar[k]){
                        j++;
                        k--;
                    }
                    else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            else {
                while (j<=k) {
                    if (ar[j] == ar[k]) {
                        j++;
                        k--;
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
