package leetcode;

public class minSpeed {
    public static void main(String[] args) {
        int[] arr = {1,3,2};

        System.out.println(minSpeedOnTime(arr, 2.7));
    }

    public static boolean isPossible(int[] dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / speed;
            if (i != dist.length - 1)
                ans = ans + Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }
    public static int minSpeedOnTime(int[] dist, double hour) {
        int st= 1;
        int end = (int)1e7;
        int n = dist.length;
        int minspeed = -1;

        while(st<=end){
            int mid = st + (end-st)/2;
            double time = 0;

            for(int i =0;i<n;i++){

                double d = dist[i] * 1.0 / mid;

                if(i==n-1){
                    time += d;
                }
                else{
                    time += Math.ceil(d);
                }
            }

            if(time>hour){

                end = mid-1;
            }else{
                minspeed = mid;
                st = mid+1;
            }
        }

        return minspeed;
    }
}
