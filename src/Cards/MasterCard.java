package Cards;

public class MasterCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay using master card");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay using master card");
    }

    @Override
    public void onlinePay() {
        System.out.println("Online pay using master card");
    }
}
