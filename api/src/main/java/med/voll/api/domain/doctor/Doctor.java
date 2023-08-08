package med.voll.api.domain.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.address.Address;

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
    private Boolean active;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorRegisterData doctorRegisterData) {
        this.active = true;
        this.name = doctorRegisterData.name();
        this.email = doctorRegisterData.email();
        this.phone = doctorRegisterData.phone();
        this.crm = doctorRegisterData.crm();
        this.specialty = doctorRegisterData.specialty();
        this.address = new Address(doctorRegisterData.address());
    }
    public void udpateInfo(DoctorUpdateData data) {
        if(data.name() != null) {
            this.name = data.name();
        }
        if(data.phonenumber() != null){
            this.phone = data.phonenumber();
        }
        if (data.address() != null){
            this.address.updateInfo(data.address());
        }
    }

    public void delete() {
        this.active = false;
    }
}

