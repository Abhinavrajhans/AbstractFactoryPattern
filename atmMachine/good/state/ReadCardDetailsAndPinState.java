package good.state;
import good.Enums.ATMState;
import good.models.Card;
import good.models.ATM;
import good.services.CardManagerService;

public class ReadCardDetailsAndPinState implements State {
    
    private final ATM atm;

    public ReadCardDetailsAndPinState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
       throw new IllegalStateException("Cannot initialize transaction while reading card details and PIN.");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card,String pin) {
       CardManagerService manager= this.atm.getCardManagerFactory().getCardManagerService(card.getCardType());
       boolean isCardValid = manager.validateCard(card, pin);
       if(isCardValid) {
         // move to next state
         atm.setState(new ReadingCashWithdrawalDetailsState(atm));
         return isCardValid;
       }
       // on invalid card details or pin , move back to ready for transaction state
       atm.setState(new EjectingCardState(atm));
       return isCardValid;
    }


    @Override
    public int dispenseCash(Card card ,int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading card details and PIN.");
    }

    @Override
    public void ejectCard(int transactionId) {
        throw new IllegalStateException("Cannot eject card while reading card details and PIN.");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card ,int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while reading card details and PIN.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }


    @Override
    public boolean cancelTransaction(int transactionId) {
        try{
            this.atm.setState(new ReadyForTransactionState(atm));
            return true;
        }
        catch(Exception e){
            throw new IllegalStateException("Cannot cancel transaction at this moment.");
        }
    }
}
