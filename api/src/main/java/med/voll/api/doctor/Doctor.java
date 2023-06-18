package med.voll.api.doctor;

import jakarta.persistence.*;
import med.voll.api.address.Address;
import med.voll.api.address.AddressRegisterData;

@Entity(name = "Doctor")
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

}
