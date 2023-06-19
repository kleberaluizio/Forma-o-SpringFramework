package med.voll.api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

@Entity(name = "Patient")
@Table(name= "patients")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String phone;

    @Embedded
    private Address address;


    public Patient(PatientRegisterData patientRegisterData) {
        this.name = patientRegisterData.name();
        this.email = patientRegisterData.email();
        this.cpf = patientRegisterData.cpf();
        this.phone = patientRegisterData.phone();
        this.address = new Address(patientRegisterData.address());
    }
}
