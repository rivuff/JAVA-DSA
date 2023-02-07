package DailyChellange;

import java.lang.reflect.Array;
import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

//        int i=0;
//        int j =0;
//
//        int n = nums.length;
//
//        while(i<n){
//            while(nums[i]==0){
//                i++;
//            }
//            nums[j]=nums[i];
//            j++;
//            i++;
//        }
//
//        while(j<n){
//            nums[j]=0;
//            j++;
//        }

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) {
        int i=0;
        int j =0;

        int n = nums.length;

        while(i<n){
            while(nums[i]==0){
                i++;
            }
            nums[j]=nums[i];
            j++;
            i++;
        }

        while(j<n){
            nums[j]=0;
            j++;
        }
    }
}
