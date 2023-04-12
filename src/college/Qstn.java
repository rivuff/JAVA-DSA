package college;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Qstn {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t= scr.nextInt();

        for(int i =0;i<t;i++){
            int n = scr.nextInt();
            String s = "";
            for(int j=0;j<n;j++){
                String str = scr.next();

                if(isAllPresent(str)==1 ){
                    s+='1';
                }
                else {
                    s+='0';
                }
            }
            System.out.println(s);
            int ans = Integer.valueOf(s);

            System.out.println(binaryToDecimal(ans));

        }
    }

    public static int isAllPresent(String str)
    {
        // ReGex to check if a string
        // contains uppercase, lowercase
        // special character & numeric value
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!$%^&*., ?]).+$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // then print No
        if (str == null) {
            return 0;
        }

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);

        // Print Yes if string
        // matches ReGex
        if (m.matches())
           return 1;
        else
            return 0;
    }

    public static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }
    
}
