package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregnants(registrated);
        addElders(registrated);
        for (Person actual : registrated) {
            if (!vaccinationList.contains(actual)) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addPregnants(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addElders(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getAge() > 65 && actual.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(actual);
            }
        }
    }
}
