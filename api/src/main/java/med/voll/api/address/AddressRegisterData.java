package med.voll.api.address;

public record AddressRegisterData(
        String street,
        String neighbourhood,
        String cep,
        String city,
        String state,
        String extra,
        String number

) {
}
