package med.voll.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.address.AddressRegisterData;
import med.voll.api.doctor.Specialty;

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
