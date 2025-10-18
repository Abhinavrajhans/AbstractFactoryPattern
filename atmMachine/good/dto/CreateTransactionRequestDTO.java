package good.dto;

public class CreateTransactionRequestDTO {
    
    private final String atmId;

    public CreateTransactionRequestDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
