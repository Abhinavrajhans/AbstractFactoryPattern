package good.state;

import good.Enums.ATMState;
import good.apis.BackendAPI;
import good.factories.CardManagerFactory;
import good.models.ATM;
import good.models.Card;

public class EjectingCardState implements State{
     
    private final ATM atm;
    private final BackendAPI backendAPI;
    private final CardManagerFactory cardManagerFactory;

    public EjectingCardState(ATM atm, BackendAPI backendAPI) {
        this.atm = atm;
        this.backendAPI = backendAPI;
        this.cardManagerFactory = new CardManagerFactory(backendAPI);
    }

    @Override
    public int initTransaction() {
       throw new IllegalStateException("Cannot initialize transaction while ejecting card.");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card,String pin) {
       throw new IllegalStateException("Cannot read card details and PIN while ejecting card.");
    }


    @Override
    public int dispenseCash(Card card ,int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card.");
    }

    @Override
    public void ejectCard(int transactionId) {
        System.out.println("Card ejected , please take your card.");
        this.atm.setState(new ReadyForTransactionState(atm, backendAPI));

    }

    @Override
    public boolean readCashWithdrawalDetails(Card card ,int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while ejecting card.");
    }

    @Override
    public ATMState getState() {
        return ATMState.EJECTING_CARD;
    }


    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while ejecting card.");
    }
}
