package DynamicProgramming;

public class houseRobberIV {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int n = arr.length;
        System.out.println(solve(n-1,arr,3));
    }

    static int solve(int ind, int[] arr, int k){
        if(k==0 && ind+2>=0){
            return arr[ind+2];
        }

        if(ind+2<0){
            return Integer.MAX_VALUE;
        }
        int take=Integer.MAX_VALUE;
        if(ind>=0){
            take = Math.max(arr[ind],solve(ind-2, arr,k-1));
        }
        int notTake = solve(ind-1,arr,k);


        return Math.min(take,notTake);
    }
}
