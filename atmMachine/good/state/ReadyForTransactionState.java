package good.state;


import good.Enums.ATMState;
import good.models.Card;
import good.models.ATM;
import good.dto.CreateTransactionRequestDTO;

public class ReadyForTransactionState implements State {
    // when the ATM is in ready_For_transaction state it can only start a new transaction

    private final ATM atm;

    public ReadyForTransactionState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        // here we have to create the CreateTransactionDTO and then call the backendAPI to create a new transaction
        CreateTransactionRequestDTO createTransactionDTO = new CreateTransactionRequestDTO(atm.getAtmId());
        // we should have used a adapeter pattern to convert the CreateTransactionDTO to the format required by the backendAPI
        // and should have used the builder pattern also .
        int newTransactionID =atm.getBackendAPI().createTransaction(createTransactionDTO);

        if (newTransactionID <= 0) {
            throw new RuntimeException("Transaction could not be created.");
        }
        //Now that we have the transaction ID from the backend , we should move the ATM to the next state which is ReadCardDetailsAndPinState
        // now here we have to migrate for that we have to do 2 things 
        // 1. Tell the atm that your state is changing
        // 2. Tell the backend that the state of the ATM is changing
        atm.setState(new ReadCardDetailsAndPinState(atm));
        return newTransactionID; // Return a transaction ID
    }

    @Override
    public boolean readCardDetailsAndPin(Card card,String pin) {
        throw new IllegalStateException("Cannot read card details and PIN without inserting a card.");
    }


    @Override
    public int dispenseCash(Card card ,int amount,int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and PIN.");
    }

    @Override
    public void ejectCard(int transactionId) {
        throw new IllegalStateException("Cannot eject card without reading card details and PIN.");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details without reading card details and PIN.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("No transaction to cancel in ReadyForTransaction state.");
    }
    
}
