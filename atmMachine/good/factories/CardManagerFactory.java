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
    
    public CardManagerService getCardManagerService(CardType cardType)
    {
        CardManagerService cardManagerService = null;
        if(cardType.equals(CardType.DEBIT))
        {
            cardManagerService = new DebitCardManagerService(backendAPI);
        }
        else if(cardType.equals(CardType.CREDIT))
        {
            cardManagerService = new CreditCardManagerService(backendAPI);
        }  
        else {
            throw new IllegalArgumentException("Invalid Card Type");
        }
        return cardManagerService;
    }
}
