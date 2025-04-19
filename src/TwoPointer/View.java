package TwoPointer;

public class View {
    public static void main(String[] args) {
        int[] arr = {5, 9, 20, 22, 28, 35, 60, 350, 358, 359, 360};
        System.out.println(solve(arr));
    }


    static int solve(int[] arr){

        int i = 0;
        int j =0;
        int n =arr.length;
        int count = 0;
        int maxCount = 0;
        while (i<n && j<n){
            if(Math.abs(arr[i]-arr[j]) <=30){
                j++;
                count++;
                maxCount = Math.max(count, maxCount);
            }else {
                count--;
                i++;
            }
        }
        return maxCount;
    }
}
