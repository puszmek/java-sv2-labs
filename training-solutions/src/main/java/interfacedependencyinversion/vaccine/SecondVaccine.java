package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addYoungPeople(registrated);
        for (Person actual : registrated) {
            if (actual.getAge() > 65 && actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addYoungPeople(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getAge() <= 65 && actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(actual);
            }
        }
    }
}
