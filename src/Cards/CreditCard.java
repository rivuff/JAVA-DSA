package Cards;

public abstract class CreditCard {
    private String cardNo;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public void setCardNo(String cardNo){
        this.cardNo = cardNo;
    }

    public String getCardNo(){
        return this.cardNo;
    }

    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }

    public String getCardHolder(){
        return this.cardHolder;
    }

    public void setCvv(String cvv){
        this.cvv = cvv;
    }

    public String getCvv(){
        return this.cvv;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate(){
        return this.expiryDate;
    }

    public abstract void tapAndPay();
    public abstract void swipeAndPay();
    public abstract void onlinePay();

}
