package LLD.ATMMachine.state;

import LLD.ATMMachine.DTO.CreateTransactionDTO;
import LLD.ATMMachine.api.BackendApi;
import LLD.ATMMachine.enums.AtmState;
import LLD.ATMMachine.models.ATM;
import LLD.ATMMachine.models.Card;

public class ReadyForTransaction implements State{

    private final ATM atm ;
    private final BackendApi backendApi;

    public ReadyForTransaction(ATM atm, BackendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }

    @Override
    public int initTransaction() {
        CreateTransactionDTO createTransactionDTO = new CreateTransactionDTO(this.atm.getAtmId());

        int transactionId = backendApi.createTransaction(createTransactionDTO);

        this.atm.changeState(new ReadCardDetailsAndPin());
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        throw new IllegalArgumentException("Illegal");
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalArgumentException("Illegal");

    }

    @Override
    public void ejectCard() {
        throw new IllegalArgumentException("Illegal");

    }

    @Override
    public void readCashWithdrawDetails(int transactionId, int amount) {
        throw new IllegalArgumentException("Illegal");
    }

    @Override
    public AtmState getState() {
        return AtmState.READY_FOR_TRANSACTION;
    }
}
