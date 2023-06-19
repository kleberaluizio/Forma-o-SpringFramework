package med.voll.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;
import med.voll.api.address.AddressRegisterData;

@Entity(name = "Doctor")
@Table(name = "doctors")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorRegisterData doctorRegisterData) {
        this.name = doctorRegisterData.name();
        this.email = doctorRegisterData.email();
        this.phone = doctorRegisterData.phone();
        this.crm = doctorRegisterData.crm();
        this.specialty = doctorRegisterData.specialty();
        this.address = new Address(doctorRegisterData.address());
    }
}
