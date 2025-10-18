package good.models;


import good.apis.BackendAPI;
import good.state.State;
import good.state.ReadyForTransactionState;
import good.dto.UpdateATMStateRequestDTO;
import good.factories.CardManagerFactory;
import good.services.CashDispenserService;

public class ATM {

    private final String atmId;
    private State state;
    private final BackendAPI backendAPI;
    private final CashDispenserService cashDispenserService; // Add this
    private final CardManagerFactory cardManagerFactory;
 
    public ATM(String atmId, BackendAPI backendAPI, CashDispenserService cashDispenserService) {
        this.atmId = atmId;
        this.state = new ReadyForTransactionState(this);
        this.backendAPI = backendAPI;
        this.cashDispenserService = cashDispenserService;
        this.cardManagerFactory = new CardManagerFactory(backendAPI);
    }

    public String getAtmId() {
        return atmId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("ATM state changed to: " + state.getState());
        //now call the server to persist this change into the server also.
        this.backendAPI.updateState(new UpdateATMStateRequestDTO(this.atmId, state.getState()));
    }

    public BackendAPI getBackendAPI() {
        return backendAPI;
    }

    public CashDispenserService getCashDispenserService() {
        return cashDispenserService;
    }

        public CardManagerFactory getCardManagerFactory() {
        return cardManagerFactory;
    }
}
