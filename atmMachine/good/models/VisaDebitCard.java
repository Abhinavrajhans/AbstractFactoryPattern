package good.models;

import good.Enums.CardType;

public class VisaDebitCard extends Card implements Visa, Debit {
    


    public VisaDebitCard(long cardNumber,String pin, String name,CardType cardType, String bankName){ 
        super(cardNumber, pin, name, cardType, bankName);
    }
    
    @Override
    public void makePinPayment(){
        this.connectToVisaNetwork();
        System.out.println("Making PIN payment using Visa Debit Card");
    }
           
    @Override
    public void connectToVisaNetwork(){
        System.out.println("Connecting to Visa Network using Visa Debit Card");
    }
}
