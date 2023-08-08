package med.voll.api.domain.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.AddressRegisterData;

public record PatientRegisterData (
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String cpf,
        @NotBlank
        String phonenumber,
        @NotNull
        @Valid
        AddressRegisterData address
){

}
