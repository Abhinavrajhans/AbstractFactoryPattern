package good.services;

import good.apis.BackendAPI;
import good.dto.GetATMAmountRequestDTO;
import good.models.ATM;

public class CashDispenserServiceImpl implements CashDispenserService {
    
    private final BackendAPI backendAPI;

    public CashDispenserServiceImpl(BackendAPI backendAPI) {
        this.backendAPI = backendAPI;
    }

    @Override
    public void dispenseCash(ATM atm , int amount) {
        //Implementation to dispense cash using backendAPI
        GetATMAmountRequestDTO getATMAmountRequestDTO = new GetATMAmountRequestDTO(atm.getAtmId());
        int atmAmount = this.backendAPI.getATMAmount(getATMAmountRequestDTO);
        if(atmAmount < amount){
            System.out.println("Insufficient funds in ATM to dispense the requested amount: " + amount);
            throw new RuntimeException("Insufficient funds in ATM");
        }
        System.out.println("Dispensing cash: " + amount);
    }

}
