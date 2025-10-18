package good.services;

import good.models.Card;

public interface CardManagerService {
    

    boolean validateCard(Card card,String pin );

    boolean validateWithdrawalAmount(int transactionId, double amount);

    boolean doTransaction(Card card, double amount,int transactionId);
}
