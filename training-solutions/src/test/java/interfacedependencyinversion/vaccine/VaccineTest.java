package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class VaccineTest {

    Vaccine vaccine;
    List<Person> registrated;

    @BeforeEach
    void setUp() {
        registrated = new ArrayList<>();
        registrated.add(new Person("Polgár Zoltán", 37, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Hajdú Szilvia", 32, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Kovács Dénes", 34, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Fehér Tímea", 29, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Sós Sándor", 65, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Gálfi Franciska", 75, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Horváth Júlia", 24, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Karaba Imre", 84, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Cserepes Ferenc", 48, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Jakab Mária", 61, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Erdélyi Vince", 81, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Zelk Viola", 36, ChronicDisease.YES, Pregnancy.YES));
    }

    @Test
    void testFirstVaccine() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);
        Assertions.assertEquals(12, vaccine.getVaccinationList().size());
        Assertions.assertEquals("Hajdú Szilvia", vaccine.getVaccinationList().get(0).getName());
        Assertions.assertEquals("Gálfi Franciska", vaccine.getVaccinationList().get(3).getName());
        Assertions.assertEquals("Polgár Zoltán", vaccine.getVaccinationList().get(6).getName());
        Assertions.assertEquals("Jakab Mária", vaccine.getVaccinationList().get(11).getName());
    }

    @Test
    void testSecondVaccine() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);

        Assertions.assertEquals(6, vaccine.getVaccinationList().size());
        Assertions.assertEquals("Kovács Dénes", vaccine.getVaccinationList().get(0).getName());
        Assertions.assertEquals("Sós Sándor", vaccine.getVaccinationList().get(1).getName());
        Assertions.assertEquals("Gálfi Franciska", vaccine.getVaccinationList().get(4).getName());
        Assertions.assertEquals("Erdélyi Vince", vaccine.getVaccinationList().get(5).getName());
    }
}
