package LLD.ATMMachine.enums;

public enum AtmState {
    READY_FOR_TRANSACTION,
    ReadCardDetailsAndPin,
    DISPENSING_CASH,
    EJECTING_CARD,
    READING_CASH_WITHDRAW_DETAILS
}
