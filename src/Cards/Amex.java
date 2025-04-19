package Cards;

public class Amex extends CreditCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay using amex card");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay using amex card");
    }

    @Override
    public void onlinePay() {
        System.out.println("Online pay using amex card");
    }
}
