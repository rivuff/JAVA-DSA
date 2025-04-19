package LLD.ATMMachine.api;

import LLD.ATMMachine.DTO.CreateTransactionDTO;
import LLD.ATMMachine.DTO.UpdateAtmStateRequestDTO;

public interface BackendApi {

    int createTransaction(CreateTransactionDTO dto);

    boolean updateAtmState(UpdateAtmStateRequestDTO updateDto);
}
