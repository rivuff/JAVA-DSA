package leetcode;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
        System.out.println(minEatingSpeed2(piles,h));
    }

    public static int minEatingSpeed(int[] piles, int H) {
        int lo = 0;
        int hi = 1000000000;

        int n = piles.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            int h =0;

            for(int i=0;i<n;i++){
                h+=Math.ceil(1.0 * piles[i]/mid);
            }

            if(h>H){
                lo = mid+1;
            }else {
                hi = mid-1;
            }

        }

        return lo;
    }

    public static int minEatingSpeed2(int[] piles, int h) {

        int n = piles.length;
        int min = 0;
        int max = 1000000000;

        while(min<=max){
            int mid = min + (max-min)/2;
            int hr = 0;

            for(int i= 0;i<n;i++){
                hr+=Math.ceil(1.0 * piles[i]/mid);
            }
            if(hr>h){
                min = mid+1;
            }
            else{
                max = mid-1;
            }

        }

        return min;
    }
}


