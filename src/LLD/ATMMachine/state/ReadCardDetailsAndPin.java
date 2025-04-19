package LLD.ATMMachine.state;

import LLD.ATMMachine.enums.AtmState;
import LLD.ATMMachine.models.Card;

public class ReadCardDetailsAndPin implements State{
    @Override
    public int initTransaction() {
        throw new IllegalArgumentException("Card reading State");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {

        if(card.getCardType() == "card" && card.getPin()== 21 && card.getCardNo() == 32342 && card.getBankName()=="SBI"){
            return true;
        }

        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Can not dispense cash while reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Can not eject the card while reading details");
    }

    @Override
    public void readCashWithdrawDetails(int transactionId, int amount) {
        throw new IllegalStateException("Can not read withdraw details while reading card details and pin");
    }

    @Override
    public AtmState getState() {
        return AtmState.ReadCardDetailsAndPin;
    }
}
