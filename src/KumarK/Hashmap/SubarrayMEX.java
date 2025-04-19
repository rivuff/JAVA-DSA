package KumarK.Hashmap;

import java.util.HashMap;

// Have to find the MEX for every subaray
public class SubarrayMEX {
    public static void main(String[] args) {

    }

    static int solve(int n, int[] arr, int k){

        // will start with finding how many subarrays are there for every mex
        // For MEX =1 all the subarrays that is not containing 1 is MEX of that subarray.
        //[4,3,1,2,5]

        // First in a hashmap will store all the element, and it's index.

        HashMap<Integer, Integer> map =new HashMap<>();

        for(int i =0;i<n;i++){
            map.put(arr[i], i);
        }

        int[] ans = new int[n+2];

        int left = map.get(1);
        int right = map.get(1);

        int n1 = left-1;
        int n2 = n - right;

        ans[1] = n1*(n1+1)/2 + n2*(n2+1)/2;

        int i = 2;

        while (i<=n){
            int key = map.get(i);

            if(left>key && right>key){
                int x = left - key -1;
                int y = n - right;

                ans[i] = (x+1)*(y+1);
            }else if(left<key && right<key){
                int x = left-1;
                int y = key - right-1;

                ans[i] = (x+1)*(y+1);
            }

            left = Math.min(left, key);
            right = Math.max(right, key);
            i++;
        }

        ans[i+1] = 1;

        int c = 0;
        int topG = 0;
        i = 1;
        while (i <= n + 1) {
            c += ans[i];
            if (c < k) {
                // Do nothing
            } else {
                topG = i;
                i = n + 5;
                break;
            }
            i++;
        }

        return topG;

    }
}
