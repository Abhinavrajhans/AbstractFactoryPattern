package good.services;

import good.models.Card;
import good.apis.BackendAPI;


public class DebitCardManagerService implements CardManagerService {


    private final BackendAPI backendAPI;

    public DebitCardManagerService(BackendAPI backendAPI) {
        this.backendAPI = backendAPI;
    }
    
    @Override
    public boolean validateCard(Card card, String pin) {
        // ideally we should make these also connect to API
        //make a dto , write some api
        return true; // Placeholder
    }

    @Override
    public boolean validateWithdrawalAmount(int transactionId, double amount) {
        // Implement withdrawal amount validation logic for debit cards here
        return true; // Placeholder
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        // Implement transaction logic for debit cards here
        return true; // Placeholder
    }
    
}
