package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressRegisterData(
        @NotBlank
        String street,
        @NotBlank
        String neighbourhood,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String city,
        @NotBlank
        String state,
        String extra,
        String number

) {
}
