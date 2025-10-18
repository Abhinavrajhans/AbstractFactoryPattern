package problematic;

public class ATM {

    //Enum for ATM states
    private enum ATMState {
        IDLE,
        TRANSACTION_IN_PROGRESS,
        CARD_INSERTED,
        AMOUNT_ENTERED,
        DISPENSING_CASH
    }


    // Instance variables 
    private String atmId;   // Unique identifier for the ATM
    private ATMState state; // Current state of the ATM

    public ATM(String atmId) {
        this.atmId = atmId;
        this.state = ATMState.IDLE; // Default state is IDLE
    }
    
}