package leetcode;

public class maxVal {
    public static void main(String[] args) {

        int[] arr ={9,7,5,3,3,4,6,10,3};
        System.out.println(maxValue(9,arr));
    }

    public static long maxValue(int n, int arr[]) {
        // Code Here.
        if(n==3){
            long a =  (arr[0]-arr[1])*arr[2];
            if(a>0){
                return a;
            }
            return 0;
        }

        int x =n-1;
        long[] maxLast = new long[n];
        int maxi = arr[x];
        while (x>=0){
            maxi = Math.max(maxi, arr[x]);
            maxLast[x] = maxi;
            x--;
        }
        int y =0;
        long[] maxFirst = new long[n];
        int maxf = arr[y];
        while(y<n){
            maxf= Math.max(maxf, arr[y]);
            maxFirst[y] = maxf;
            y++;
        }

        int ind = 2;
        long j = arr[1];
        long i = arr[0];
        long k =0;
        for(int m =2;m<n;m++){
            k=Math.max(k,arr[m]);
        }


        long max = (i-j)*k;
        while(ind<n-1){
            i = maxFirst[ind-1];
            j = arr[ind];
            k =maxLast[ind+1];

            long tempMax = (i-j)*k;
            max = Math.max(tempMax,max);
            ind++;
        }

        return max;

    }
}

//            for(int m = ind+2;m<n;m++){
//                k = Math.max(k, (long)arr[m]);
//            }