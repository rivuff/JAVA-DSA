package leetcode;

public class MonkeyOnPoligon {
    public static void main(String[] args) {

        int n = 500000003;
        int mod = 1000000007;
        int sum =2;
        while (n>0){
            sum = (sum*2)%mod;
            n--;
        }

        System.out.println(sum);
        int ans= sum -2;

        System.out.println(ans);
    }
}
