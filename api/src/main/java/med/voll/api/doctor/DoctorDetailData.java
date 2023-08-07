package med.voll.api.doctor;

import med.voll.api.address.Address;

public record DoctorDetailData (Long id, String name, String email, String crm, String phonenumber, Specialty specialty, Address address){

    public DoctorDetailData(Doctor doctor){
        this(doctor.getId(),
                doctor.getName(),
                doctor.getEmail(),
                doctor.getPhone(),
                doctor.getCrm(),
                doctor.getSpecialty(),
                doctor.getAddress());
    }
}
