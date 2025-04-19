package CompanyBased.Accenture;

import java.util.Scanner;

public class nBaseNotation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int num = scr.nextInt();

        System.out.println(solve(n, num));
    }

    public static String solve(int n, int nums){
        String str = "";

        while (n!=0){
            int rem = n%nums;
            n = n/nums;

            if(rem<=9){
                str = rem + str;
            }else{
                int ext= rem - 10;
                char x = (char)('A' + (char)ext);
                str = x + str;
            }
        }
        return str;
    }
}
