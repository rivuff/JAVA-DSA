package DailyChellange;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 1;

        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        long sum = 0;
        int n = num.length;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            sum+=num[i];
            sum=sum*10;
        }
        sum = sum/10;

        sum +=k;

        String str = Long.toString(sum);

        int m = str.length();

        for(int i=0;i<m;i++){
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        return list;
    }
}
