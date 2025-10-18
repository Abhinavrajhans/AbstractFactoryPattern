package good.dto;
import good.models.Card;

public class ValidateCardRequestDTO {
    
    private final Card card;
    private final String givenPin;

    public ValidateCardRequestDTO(Card card, String givenPin) {
        this.card = card;
        this.givenPin = givenPin;
    }

    public Card getCard() {
        return card;
    }   

    public String getGivenPin() {
        return givenPin;
    }
}
