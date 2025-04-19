package Cards;

public class Visa extends CreditCard implements RefundCompatible{

    public RefundLogic refundAlgoRithm;

    Visa(RefundLogic refundAlgoRithm){
        this.refundAlgoRithm = refundAlgoRithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay using visa card");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay using visa card");
    }

    @Override
    public void onlinePay() {
        System.out.println("Online pay using visa card");
    }

    @Override
    public void refundAmount() {
        refundAlgoRithm.doRefund();
    }
}
