package leetcode;

public class primeFactor {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(smallestValue(n));
    }

    public static int smallestValue(int n) {
        if (isPrime(n)){
            return n;
        }
        return solve(n,0);
    }

    public static int solve(int n, int sum){
        while (!isPrime(sum)){

        }
        while (n%2==0){
            sum+=2;
            n=n/2;
        }

        for (int i = 3; i <= n; i+= 2)
        {
            while (n%i == 0)
            {
                sum+=i;
                n /= i;
            }
        }
        if (n==1){
            return solve(sum,0);
        }

        return -1;
    }

    public static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
