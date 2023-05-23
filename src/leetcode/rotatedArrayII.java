package leetcode;

public class rotatedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr, 0));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot]==target){
            return true;
        }
        if(target>= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end){


        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>target){

                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else return true;
        }
        return false;
    }

    public static int findPivot(int[] nums){
        int start=0;
        int end = nums.length-1;


        while(start<=end){
            int mid= start + (end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<=nums[mid]){
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }
}
