package med.voll.api.doctor;

public record DoctorList(Long id, String name, String crm, String email, Specialty specialty) {

    public DoctorList(Doctor doctor){
        this(doctor.getId(), doctor.getName(), doctor.getCrm(), doctor.getEmail(), doctor.getSpecialty());
    }
}
