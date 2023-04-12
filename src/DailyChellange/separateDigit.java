package DailyChellange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class separateDigit {
    public static void main(String[] args) {
        int[] nums = {12,43,54,65};
        int[] arr = separateDigits(nums);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        int n = nums.length;
        String str = new String();

        for(int i =0;i<n;i++){
            int a= nums[i];
            String b = Integer.toString(a);
            str +=b;
        }
        int m =str.length();
        
       int[] arr =  new int[m];
        for (int i = 0; i <m; i++) {
            int a = str.charAt(i)-'0';
            arr[i]=a;
        }
        return arr;
    }
}
