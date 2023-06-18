package med.voll.api.address;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String neighbourhood;
    private String cep;
    private String city;
    private String state;
    private String extra;
    private String number;

}
