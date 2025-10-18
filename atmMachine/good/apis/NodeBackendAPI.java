package good.apis;

import good.dto.CreateTransactionRequestDTO;
import good.dto.GetATMAmountRequestDTO;
import good.dto.UpdateATMStateRequestDTO;
import good.dto.ValidateCardRequestDTO;

public class NodeBackendAPI implements BackendAPI {

    //this class should only be responsible for connecting to the backend and then returning the response .
    @Override
    public int createTransaction(CreateTransactionRequestDTO createTransactionDTO) {
        //code to connect to backend and create a transaction
        // 1. Validations
        if(createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()) {
            throw new IllegalArgumentException("ATM ID cannot be null or empty");
        }
        // 2. Connect to backend and create transaction
        System.out.println("Connecting to backend to create transaction for ATM ID: " + createTransactionDTO.getAtmId());
        // 3. Return transaction ID
        // to mimic the backend call let's return a new random transaction ID
        return (int)(Math.random()*1000); //dummy transaction ID
    }   


    @Override
    public boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO) {
        //Assume that there is the implementation that calls the backend to update the state of the ATM
        return true;
    }

    @Override
    public boolean validateCard(ValidateCardRequestDTO validateCardRequestDTO) {
        return validateCardRequestDTO.getCard().getPin().equals(validateCardRequestDTO.getGivenPin());
    }

    @Override 
    public int getATMAmount(GetATMAmountRequestDTO  getATMAmountRequestDTO) {
        //Assume that there is the implementation that calls the backend to get the amount of cash available in the ATM
        return 10000; //dummy amount
    }
}
