package TwoPointer;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 10, 11};
        int target = 7;

        System.out.println(solve(arr, target));
    }

    static int solve(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        int sum = 0;
        int count = 0;
       while (i<j){
           sum = arr[i]+arr[j];
           if(sum<target){
               count+= j -i;
               i++;
           }else {
               j--;
           }
       }

       return count;
    }

}
