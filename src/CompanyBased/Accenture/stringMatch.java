package CompanyBased.Accenture;

import java.util.HashMap;
import java.util.HashSet;

public class stringMatch {
    public static void main(String[] args) {
        String str = "aabbdabdccc";
        int n = str.length();
        int i = 1;
        char prev = str.charAt(0);
        int count = 0;
        while (i<n){
            if(prev==str.charAt(i)){
                i++;
                prev = str.charAt(i);

            }else count++;

            i++;
        }

        System.out.println(count);

    }
}
