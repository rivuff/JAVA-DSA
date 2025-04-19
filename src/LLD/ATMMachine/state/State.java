package LLD.ATMMachine.state;

import LLD.ATMMachine.enums.AtmState;
import LLD.ATMMachine.models.Card;

public interface State {
    int initTransaction();

    boolean readCardDetailsAndPin(Card card);

    int dispenseCash(int transactionId);

    void ejectCard();

    void readCashWithdrawDetails(int transactionId, int amount);

    AtmState getState();
}
