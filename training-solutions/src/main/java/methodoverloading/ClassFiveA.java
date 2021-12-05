package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> nameOfStudent = Arrays.asList("Kiss Péter", "Nagy Dániel", "Molnár Judit", "Kovács Dénes", "Tóth Janka", "Jakab Vince", "Fehér Viola", "Deák Sarolta", "Kiss Kálmán", "Nemes Ferenc");

    public String getTodayReferringStudent(int number) {
        try {
            return this.nameOfStudent.get(number - 1);
        } catch (IndexOutOfBoundsException ioobe) {
            throw new IllegalArgumentException("Invalid number!");
        }
    }

    public String getTodayReferringStudent(Number number) {
        return this.nameOfStudent.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return this.nameOfStudent.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }

    public List<String> getNameOfStudent() {
        return nameOfStudent;
    }
}
