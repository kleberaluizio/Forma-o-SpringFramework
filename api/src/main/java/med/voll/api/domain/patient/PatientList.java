package med.voll.api.domain.patient;

public record PatientList (Long id, String name, String email, String cpf){

    public PatientList(Patient p){
        this(p.getId(),p.getName(), p.getEmail(), p.getCpf());
    }
}
