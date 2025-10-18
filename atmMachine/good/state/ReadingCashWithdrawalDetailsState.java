package good.state;

import good.Enums.ATMState;
import good.models.Card;
import good.services.CardManagerService;
import good.models.ATM;

public class ReadingCashWithdrawalDetailsState implements State {
    
    private final ATM atm;

    public ReadingCashWithdrawalDetailsState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
       throw new IllegalStateException("Cannot initialize transaction while reading cash withdrawal details.");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card,String pin) {
       throw new IllegalStateException("Cannot read card details and PIN while reading cash withdrawal details.");
    }


    @Override
    public int dispenseCash(Card card ,int amount,int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading cash withdrawal details.");
    }

    @Override
    public void ejectCard(int transactionId) {
        throw new IllegalStateException("Cannot eject card while reading cash withdrawal details.");
    }


    @Override
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        CardManagerService manager = this.atm.getCardManagerFactory().getCardManagerService(card.getCardType());
        boolean isWithdrawalAmountValid = manager.validateWithdrawalAmount(transactionId, amount);
        
        if(isWithdrawalAmountValid) {
            // Get service from ATM
            atm.setState(new DispensingCashState(atm));
        } else {
            atm.setState(new EjectingCardState(atm));
        }
        
        return isWithdrawalAmountValid;
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CASH_WITHDRAWAL_DETAILS;
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
