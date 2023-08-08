package med.voll.api.domain.patient;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.AddressRegisterData;

public record PatientUpdateData(@NotNull Long id, String name, String email, String phonenumber, AddressRegisterData address) {
}
