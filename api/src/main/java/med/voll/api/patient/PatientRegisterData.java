package med.voll.api.patient;

import med.voll.api.address.AddressRegisterData;
import med.voll.api.doctor.Specialty;

public record PatientRegisterData (
        String name,
        String email,
        AddressRegisterData address
){

}
