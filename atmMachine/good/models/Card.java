
package good.models;

import good.Enums.CardType;

public class Card {
    
    private final long cardNumber;
    private final String pin;
    private final String name;
    private final CardType cardType;
    private final String bankName;

    public Card(long cardNumber, String pin, String name, CardType cardType, String bankName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

}