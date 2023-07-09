package leetcode;

public class longestSubarrayOfOne {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;
        int flag = 0;
        int maxCount = 0;
        while(i<n){
            if(nums[i]==1){
                count++;
            }
            else{
                if(flag==0){
                    flag=1;
                    j=i;
                }
                else{
                    maxCount = Math.max(maxCount, count);
                    i = j;
                    flag=0;
                    count = 0;
                }
            }
            i++;
        }

        if(count==n){
            return n-1;
        }

        return Math.max(count, maxCount);
    }
}
