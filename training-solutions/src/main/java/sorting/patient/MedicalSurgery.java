package sorting.patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> patients = new ArrayList<>();

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> result = new ArrayList<>(patients);
        Collections.sort(result, new PatientComparator());
        return result;
    }
}
