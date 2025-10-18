package good.dto;

import good.Enums.ATMState;

public class UpdateATMStateRequestDTO {

    private final String atmId;
    private final ATMState newState;

    public UpdateATMStateRequestDTO(String atmId,ATMState newState) {
        this.atmId = atmId;
        this.newState = newState;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getNewState() {
        return newState;
    }
    
}
