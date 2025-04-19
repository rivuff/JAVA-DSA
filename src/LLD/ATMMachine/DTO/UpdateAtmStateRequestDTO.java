package LLD.ATMMachine.DTO;

import LLD.ATMMachine.enums.AtmState;

public class UpdateAtmStateRequestDTO {
    private final String atmId;
    private final AtmState state;

    public UpdateAtmStateRequestDTO(String atmId, AtmState state){
        this.atmId = atmId;
        this.state = state;
    }

    public String getAtmId() {
        return atmId;
    }

    public AtmState getState() {
        return state;
    }
}
