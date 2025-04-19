package LLD.ATMMachine.models;

public class Card {
    private final long cardNo;
    private final int pin;

    private final String name;
    private final String cardType;

    private final String bankName;


    public Card(long cardNo, int pin, String name, String cardType, String bankName) {
        this.cardNo = cardNo;
        this.pin = pin;
        this.name = name;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public long getCardNo() {
        return cardNo;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    public String getBankName() {
        return bankName;
    }


}
