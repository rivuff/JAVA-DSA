package leetcode;

public class semi {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        System.out.println(semiOrderedPermutation(nums));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int a= -1;
        int b = -1;
        int count = 0;
        if(nums[0]==1 && nums[n-1] == n){
            return 0;
        }

        for(int i = 0;i<n;i++){
            if(nums[i]==1){
                a = i;
            }
            else if(nums[i]==n){
                b = i;
            }
        }

        if(a>b){
            count = a + n - b-1;
        }
        else{
            count = a + n - b;
        }

        return count;


    }
}
