package good.services;
import good.models.Card;
import good.apis.BackendAPI;
import good.dto.ValidateCardRequestDTO;

public class CreditCardManagerService implements CardManagerService {

    private final BackendAPI backendAPI;

    public CreditCardManagerService(BackendAPI backendAPI) {
        this.backendAPI = backendAPI;
    }
    
    @Override
    public boolean validateCard(Card card, String pin) {
        ValidateCardRequestDTO validateCardRequestDTO = new ValidateCardRequestDTO(card, pin);
        return backendAPI.validateCard(validateCardRequestDTO);
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
