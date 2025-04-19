package college;

import java.util.Arrays;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {

        int[] nums = {40,29,-8,-50,23,-17,31,46,16,4,15,-32,41,-43,31,-43,27,-43};
        int k=4;
        int x= 3;

        int[] ans = getSubarrayBeauty(nums, k,x);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] arr = new int[101];
        int[] ans = new int[n-k+1];

        for(int j =0;j<k;j++){
            arr[nums[j]+50] +=1;
        }
        int cnt= 0;
        int flag = 0;
        for(int i =0;i<=50;i++){
            if(arr[i]>=1){
                cnt+=arr[i];
            }
            if(cnt>=x){
                flag =1;
                ans[0]= i-50;
                break;
            }
        }
        if(flag==0){
            ans[0]=0;
        }

        int i=1;
        int j = k;


        while(i<n-k+1){
            flag =0;
            arr[nums[i-1]+50] = arr[nums[i-1]+50]-1;
            arr[nums[j]+50] = arr[nums[j]+50]+1;
            int count = 0;
            for(int m =0;m<=50;m++){
                if(arr[m]>=1){
                    count+= arr[m] ;
                }
                if(count>=x){
                    flag=1;
                    ans[i]= m-50;
                    break;
                }
            }
            if(flag==0){
                ans[i] = 0;
            }
            i++;
            j++;

        }

        return ans;

    }
}
