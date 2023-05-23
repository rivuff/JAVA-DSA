package leetcode;

public class EditingTable{
    public static void main(String[] args) {
        int[] arr = {7,8,5};
        int n= 3;
        int num = 20;

        System.out.println(solve(n,arr,num));
    }

    static int solve(int n, int[] arr, int num){
        long min = arr[0];
        long max = 0;
        for(int i =0;i<n;i++){
            max+=arr[i];
            if(min<arr[i]){
                min=arr[i];
            }
        }


        while(min<max){
            long mid = min + (max-min)/2;

            if(isValid(arr, mid, num)){
                max = mid;
            }
            else min = mid+1;

        }

        return (int) min;
    }

    static boolean isValid(int[] arr, long mid, int num){
        int sum = 0;
        int setcount =1;

        int i = 0;

        for (int nums : arr){
            sum+=nums;

            if(sum>mid){
                setcount++;

                sum=0;
                sum+=nums;

                if(setcount>num){
                    return false;
                }
            }
        }
        return true;
    }
}
