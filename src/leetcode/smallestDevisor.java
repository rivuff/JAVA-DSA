package leetcode;

public class smallestDevisor {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 5;

        System.out.println(smallestDivisor(nums,threshold));
        System.out.println(smallestDivisor2(nums,threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n>threshold){
            return -1;
        }

        int min = 1;
        int max = 1000000;

        while(min<=max){
            int mid = min + (max-min)/2;

            int count =0;

            for(int num : nums){
                count += Math.ceil(1.0 * num/mid);

            }

            if(count>threshold){
                min = mid+ 1;
            }
            else{
                max = mid-1;
            }
        }

        return min;
    }

    public static int smallestDivisor2(int[] nums, int threshold) {
        int n = nums.length;
        if(n >threshold){
            return -1;
        }

        int min = 1;
        int max = 1000000;

        while(min<=max){
            int mid = min + (max-min)/2;

            int sum = 0;
            for(int i=0;i<n;i++){
                sum += Math.ceil(1.0 * nums[i]/mid);
            }

            if(sum>threshold){
                min = mid+1;
            }
            else max = mid-1;
        }

        return min;
    }
}
