package med.voll.api.doctor;

import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressRegisterData;

public record DoctorUpdateData(@NotNull Long id, String name, String phonenumber, AddressRegisterData address) {
}

