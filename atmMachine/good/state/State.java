package good.state;

import good.Enums.ATMState;
import good.models.Card;

public interface State {
    

    int initTransaction();

    boolean readCardDetailsAndPin(Card card,String pin); // returns true if card details are valid and false otherwise

    int dispenseCash(Card card ,int amount,int transactionId); // returns the amount dispensed

    void ejectCard(int transactionId);

    boolean readCashWithdrawalDetails(Card card ,int transactionId, int amount); // returns true if amount is valid and false otherwise

    boolean cancelTransaction(int transactionId); // returns true if transaction is cancelled successfully

    ATMState getState();
}
