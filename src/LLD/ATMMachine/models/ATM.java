package LLD.ATMMachine.models;

import LLD.ATMMachine.DTO.UpdateAtmStateRequestDTO;
import LLD.ATMMachine.api.BackendApi;
import LLD.ATMMachine.api.NodeBackEndApi;
import LLD.ATMMachine.enums.AtmState;
import LLD.ATMMachine.state.ReadyForTransaction;
import LLD.ATMMachine.state.State;

public class ATM {

    private final String atmId;
    private State state;
    private final BackendApi backendApi;

    ATM(String atmId){
        this.atmId = atmId;
        this.backendApi = new NodeBackEndApi();
        this.state = new ReadyForTransaction(this, this.backendApi);
    }

    public String getAtmId() {
        return atmId;
    }

    public void changeState(State newState){
        this.state = newState;
        //now call the backend server to persist the state change
        this.backendApi.updateAtmState(new UpdateAtmStateRequestDTO(this.atmId,  newState.getState()));
    }
}
