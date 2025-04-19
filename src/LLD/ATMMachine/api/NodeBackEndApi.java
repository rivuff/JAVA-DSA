package LLD.ATMMachine.api;

import LLD.ATMMachine.DTO.CreateTransactionDTO;
import LLD.ATMMachine.DTO.UpdateAtmStateRequestDTO;

public class NodeBackEndApi implements BackendApi{

    @Override
    public int createTransaction(CreateTransactionDTO dto) {
        if(dto.getAtmId()==null || dto.getAtmId().isEmpty()){
            throw new IllegalArgumentException("ATM ID can not be null");
        }

        //validation done
        int txnId = (int)(Math.random() + 1000);

        return txnId;
    }

    @Override
    public boolean updateAtmState(UpdateAtmStateRequestDTO updateDto) {
        //implement update function

        return true;
    }

}
