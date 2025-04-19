package LLD.ATMMachine.DTO;

public class CreateTransactionDTO {
    String atmId;

    public CreateTransactionDTO(String atmId){
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
