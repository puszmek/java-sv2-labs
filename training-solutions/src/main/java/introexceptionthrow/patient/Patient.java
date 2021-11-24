package introexceptionthrow.patient;

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
            throw new IllegalArgumentException("Érvénytelen születési év! " + yearOfBirth);
        }
        if (!(new SsnValidator().isValidSsn(ssn))) {
            throw new IllegalArgumentException("Érvénytelen TAJ szám! " + socialSecurityNumber);
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
            Patient firstPatient = new Patient("Nagy Jakab", "100000003", 1980);
            System.out.printf(details, firstPatient.getName(), firstPatient.getSocialSecurityNumber(), firstPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient secondPatient = new Patient(null, "200000006", 1985);
            System.out.printf(details, secondPatient.getName(), secondPatient.getSocialSecurityNumber(), secondPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient thirdPatient = new Patient("", "300000009", 1988);
            System.out.printf(details, thirdPatient.getName(), thirdPatient.getSocialSecurityNumber(), thirdPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient fourthPatient = new Patient("Tóth Ferenc", "400000002", 1900);
            System.out.printf(details, fourthPatient.getName(), fourthPatient.getSocialSecurityNumber(), fourthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient fifthPatient = new Patient("Molnár Péter", "500000005", 1899);
            System.out.printf(details, fifthPatient.getName(), fifthPatient.getSocialSecurityNumber(), fifthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient sixthPatient = new Patient("Kiss Bence", "600000008", 2121);
            System.out.printf(details, sixthPatient.getName(), sixthPatient.getSocialSecurityNumber(), sixthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient sixthPatient = new Patient("Kovács Péter", "712304010", 2000);
            System.out.printf(details, sixthPatient.getName(), sixthPatient.getSocialSecurityNumber(), sixthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient seventhPatient = new Patient("Horváth Géza", "8200000O8", 1999);
            System.out.printf(details, seventhPatient.getName(), seventhPatient.getSocialSecurityNumber(), seventhPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            Patient eighthPatient = new Patient("Vajda Péter", "912005410", 1997);
            System.out.printf(details, eighthPatient.getName(), eighthPatient.getSocialSecurityNumber(), eighthPatient.getYearOfBirth());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
