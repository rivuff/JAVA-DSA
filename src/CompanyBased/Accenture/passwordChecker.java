package CompanyBased.Accenture;

import java.util.Scanner;

public class passwordChecker {

    //– At least 4 characters
    //– At least one numeric digit
    //– At Least one Capital Letter
    //– Must not have space or slash (/)
    //– Starting character must not be a number

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String str = scr.next();

        System.out.println(solve(str));
    }

    public static int solve(String str){
        if(str.length()<4){
            return 0;
        }


        if(str.contains(" ")){
            return 0;
        }

        int cap = 0;

        int num =0;

        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            return 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                return 0;
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap =1;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num = 1;
        }

        if(cap==1 && num ==1){
            return 1;
        }

        return 0;

    }
}
