package med.voll.api.domain.doctor;

public record DoctorList(Long id, String name, String crm, String email, String phone, Specialty specialty) {

    public DoctorList(Doctor doctor){
        this(doctor.getId(), doctor.getName(), doctor.getCrm(), doctor.getEmail(), doctor.getPhone(),doctor.getSpecialty());
    }
}
