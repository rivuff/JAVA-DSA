package leetcode;

public class vacation {
    public static void main(String[] args) {
        int[][] arr= {{10, 40 ,70},{30,50,80},{30,60,90}};

        System.out.println(solve(arr));
    }

    static int solve(int[][] arr){
        int n= arr.length;

        int[] dpa = new int[n];
        int[] dpb = new int[n];
        int[] dpc = new int[n];

        dpa[0] = arr[0][0];
        dpb[0] = arr[0][1];
        dpc[0] = arr[0][2];

        int i = 1;
        while (i<n){
            dpa[i] = arr[i][0] + Math.max(dpb[i-1], dpc[i-1]);
            dpb[i] = arr[i][1] + Math.max(dpa[i-1], dpc[i-1]);
            dpc[i] = arr[i][2] + Math.max(dpa[i-1], dpb[i-1]);

            i++;
        }

        return Math.max(dpa[n-1], Math.max(dpb[n-1], dpc[n-1]));

    }
}
