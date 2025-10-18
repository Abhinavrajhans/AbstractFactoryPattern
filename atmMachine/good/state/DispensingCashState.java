package good.state;

import good.Enums.ATMState;
import good.models.ATM;
import good.models.Card;
import good.services.CardManagerService;

public class DispensingCashState implements State{
     
    private final ATM atm;

   
    public DispensingCashState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
       throw new IllegalStateException("Cannot initialize transaction while dispensing cash.");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card,String pin) {
         throw new IllegalStateException("Cannot read card details and PIN while dispensing cash.");
    }


    @Override
    public int dispenseCash(Card card , int amount, int transactionId) {
        CardManagerService manager= this.atm.getCardManagerFactory().getCardManagerService(card.getCardType());
        boolean isTransactionDone= manager.doTransaction( card, amount, transactionId);
        if(!isTransactionDone){
            this.atm.setState(new ReadyForTransactionState(atm));
            throw new RuntimeException("Transaction failed. Cannot dispense cash.");
        }

        this.atm.getCashDispenserService().dispenseCash(atm,amount);
        // after dispensing cash move to ready for transaction state
        atm.setState(new EjectingCardState(atm));
        return amount;
    }

    @Override
    public void ejectCard(int transactionId) {
        throw new IllegalStateException("Cannot eject card while dispensing cash.");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card ,int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while dispensing cash.");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }


    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while dispensing cash.");
    }
}
