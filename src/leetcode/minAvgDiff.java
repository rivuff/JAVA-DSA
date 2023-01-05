package leetcode;

public class minAvgDiff {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        System.out.println(minimumAverageDifference(nums));
    }

    public static int minimumAverageDifference(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int k = n;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        int index = n;
        int min = Integer.MAX_VALUE;
        int f =0;
        for(int i =0;i<n;i++){
            f+=nums[i];
            sum-=nums[i];
            int j = i+1;
            k--;
            int m =0;
            if(sum!=0 && k!=0){
                m = Math.abs(f/j - sum/k);
            }
            else m = f/j;

            if (min>m){
                min = Math.min(m,min);

                index=i;


            }

        }

        return index;
    }
}
