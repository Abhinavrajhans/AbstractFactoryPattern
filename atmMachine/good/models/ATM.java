package good.models;


import good.apis.NodeBackendAPI;
import good.apis.BackendAPI;
import good.state.State;
import good.state.ReadyForTransactionState;
import good.dto.UpdateATMStateRequestDTO;

public class ATM {

    private final String atmId;
    private State state;
    private final BackendAPI backendAPI;

    public ATM(String atmId, BackendAPI backendAPI) {
        this.atmId = atmId;
        this.state = new ReadyForTransactionState(this, new NodeBackendAPI());
        this.backendAPI = backendAPI;
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
}
