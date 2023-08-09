package KumarK.Hashmap;

public class Cisco {
    public static void main(String[] args) {
        int[][] arr = {{1,8}, {4,9}, {6,7}};
        int rate = 2;
        int maxPack = 10;

        System.out.println(solve(arr, rate, maxPack));
    }

    static int solve(int[][] arr, int rate, int maxPack){

        int n = arr.length;
        int sum  =arr[0][1];
        int time = arr[0][0];
        int lost = 0;
        if(sum> maxPack){
            lost = sum - maxPack;
        }

        if(sum>maxPack){
            sum = maxPack;
        }

        for(int i =1;i<n;i++){
            int span = arr[i][0] - time;

            if(span*rate>sum){
                sum = 0;
            }
            sum = sum - span* rate;

            sum += arr[i][1];

            if(sum>maxPack){
                lost +=sum - maxPack;
                sum = maxPack;
            }

            time = arr[i][0];
        }

        return lost;
    }
}
