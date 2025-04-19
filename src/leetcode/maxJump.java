package leetcode;

public class maxJump {
    public static void main(String[] args) {
        int[] nums = {1,3,8,4,1,2};
        System.out.println(solve(nums,0));
    }

    static int solve(int[] nums, int target){
        int n = nums.length;

        int i = 0;

        int count = 0;
        int ans =0;
        int j = i+1;
        while(i<n-1 && j<n){

            if(Math.abs(nums[i]-nums[n-1])<target){
                ans = count+1;
            }

            int dif = Math.abs(nums[i]-nums[j]);

            if(dif<= target){
                i=j;
                j++;
                count++;
            }else{
                j++;
            }
        }
        if(j==n && i==n-1){
            return count;
        }


        return ans;
    }
}
