package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String neighbourhood;
    private String cep;
    private String city;
    private String state;
    private String extra;
    private String number;

    public Address(AddressRegisterData address) {
        this.street = address.street();
        this.neighbourhood = address.neighbourhood();
        this.cep = address.cep();
        this.city = address.city();
        this.state = address.state();
        this.extra = address.extra();
        this.number = address.number();
    }
}
