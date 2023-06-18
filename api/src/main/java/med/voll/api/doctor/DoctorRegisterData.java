package med.voll.api.doctor;

import med.voll.api.address.AddressRegisterData;

public record DoctorRegisterData(
        String name,
        String email,
        String crm,
        Specialty specialty,
        AddressRegisterData address
) {
}
