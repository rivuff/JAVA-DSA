package leetcode;

public class numberOfSubarrayGCD {
    public static void main(String[] args) {
        int[] nums ={9,3,1,2,6,3};
        int k = 3;

        System.out.println(subarrayGCD(nums, k ));
    }

    private static int solution(int a, int b){
        if(b==0){
            return a;
        }

        return solution(b, a%b);
    }

    public static int subarrayGCD(int[] nums, int k) {

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int currGcd = nums[i];
            if(currGcd == k) // if element is equal to k, increment answer
                ans++;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < k) // if nums[j] < k gcd can never be equal to k for this subarray
                    break;
                currGcd = solution(nums[j], currGcd);
                if (currGcd == k)
                    ans++;
            }
        }
        return ans;
    }
}
