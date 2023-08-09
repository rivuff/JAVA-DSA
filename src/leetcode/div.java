package leetcode;

public class div {
    public static void main(String[] args) {
        int num = 9;

        System.out.println(accountBalanceAfterPurchase(num));
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {

        int div = purchaseAmount/10;

        int opt1 = (div+1)* 10;
        int opt2 = div * 10;

        if(Math.abs(opt1 -  purchaseAmount) > purchaseAmount%10){
            return 100-opt2;
        }

        return 100 - opt1;

    }
}
