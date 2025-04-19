package Cards;

public class Rupay extends CreditCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay using rupay card");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay using rupay card");
    }

    @Override
    public void onlinePay() {
        System.out.println("Online pay using rupay card");
    }
}
