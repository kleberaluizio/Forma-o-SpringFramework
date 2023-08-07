package med.voll.api.patient;

public record PatientList (String name, String email, String cpf){

    public PatientList(Patient p){
        this(p.getName(), p.getCpf(), p.getEmail());
    }
}
