package TwoPointer;

public class closestSum {
    public static void main(String[] args) {
        int[] a = {1,3,4,7};
        int[] b = {10,20,30,40};

        int target = 32;

        System.out.println(solve(a,b,4,target));
    }

    static int solve(int[] a, int[] b, int n, int target){
       int i = 0;
       int j = n-1;
        int closest = 0;
       while (i<n && j>=0){
           int sum = a[i] + b[j];

           if(sum>target) {
               j--;
           }else if(sum<target){
               i++;
               closest = Math.max(sum,closest);
           }else {
               return sum;
           }
       }

       return closest;
    }
}
