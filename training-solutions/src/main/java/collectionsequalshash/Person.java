package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public static void main(String[] args) {
        Person firstPerson = new Person("Deák Viola", 25, "147 145 189");
        Person secondPerson = new Person("Ferenc Péter", 26, "147 145 189");
        System.out.println(firstPerson.equals(secondPerson));
        System.out.println(firstPerson.hashCode());
        System.out.println(secondPerson.hashCode());
    }
}
