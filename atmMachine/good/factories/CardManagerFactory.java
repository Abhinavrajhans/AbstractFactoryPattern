package good.factories;

import good.Enums.CardType;
import good.services.CardManagerService;
import good.services.CreditCardManagerService;
import good.services.DebitCardManagerService;
import good.apis.BackendAPI;

public class CardManagerFactory {

    private final BackendAPI backendAPI;

    public CardManagerFactory(BackendAPI backendAPI) {
        this.backendAPI = backendAPI;
    }
    
    public CardManagerService getCardManagerService(CardType cardType) {
        return switch(cardType) {
            case DEBIT -> new DebitCardManagerService(backendAPI);
            case CREDIT -> new CreditCardManagerService(backendAPI);
        };
    }
}
