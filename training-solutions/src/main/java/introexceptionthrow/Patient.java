package introexceptionthrow;

import java.time.LocalDate;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;

        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("A megadott név üres!");
        }
        if (year < 1900 || year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Érvénytelen születési év!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        String details = "Név: %s, TAJ: %s, születési év: %d%n";
        try {
            Patient firstPatient = new Patient("Nagy Jakab", "252-456-141", 1980);
            System.out.printf(details, firstPatient.getName(), firstPatient.getSocialSecurityNumber(), firstPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient secondPatient = new Patient(null, "151-444-111", 1985);
            System.out.printf(details, secondPatient.getName(), secondPatient.getSocialSecurityNumber(), secondPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient thirdPatient = new Patient("", "323-000-121", 1988);
            System.out.printf(details, thirdPatient.getName(), thirdPatient.getSocialSecurityNumber(), thirdPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient fourthPatient = new Patient("Tóth Ferenc", "404-222-777", 1900);
            System.out.printf(details, fourthPatient.getName(), fourthPatient.getSocialSecurityNumber(), fourthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient fifthPatient = new Patient("Molnár Péter", "565-111-888", 1899);
            System.out.printf(details, fifthPatient.getName(), fifthPatient.getSocialSecurityNumber(), fifthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient sixthPatient = new Patient("Kiss Bence", "666-111-888", 2022);
            System.out.printf(details, sixthPatient.getName(), sixthPatient.getSocialSecurityNumber(), sixthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
