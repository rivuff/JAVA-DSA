package leetcode;

public class countDigits {
    public static void main(String[] args) {

    }

    static int solve(int nums){
        String s = Integer.toString(nums);

        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = Character.getNumericValue(s.charAt(i));
            if (nums%a==0){
                count++;
            }
        }
        return count;
    }
}
