package good.apis;

import good.dto.CreateTransactionRequestDTO;
import good.dto.GetATMAmountRequestDTO;
import good.dto.UpdateATMStateRequestDTO;
import good.dto.ValidateCardRequestDTO;

public interface BackendAPI {
    
    int createTransaction(CreateTransactionRequestDTO createTransactionDTO);

    boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO);

    boolean validateCard(ValidateCardRequestDTO validateCardRequestDTO);

    int getATMAmount(GetATMAmountRequestDTO  getATMAmountRequestDTO);
}
