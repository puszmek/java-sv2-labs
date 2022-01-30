package streamsalgorithms;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Fehér Ferenc", 1989),
                new Employee("Sós Helga", 1988),
                new Employee("Tóth Péter", 1991),
                new Employee("Pintér Dorina", 1992),
                new Employee("Kaszás Dénes", 1990),
                new Employee("Kovács Fanni", 1989)
        );

        int sum = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        System.out.println(sum);   // 11939

        int sumOfAge = employees.stream()
                .mapToInt(employee -> LocalDate.now().getYear() - employee.getYearOfBirth())
                .sum();
        System.out.println(sumOfAge);   // 193

        long numberOfEmployees = employees.stream()
                .count();
        System.out.println(numberOfEmployees);   // 6

        long numberOfEmployeesBornBefore = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(numberOfEmployeesBornBefore);    // 3

        int minYear = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Can not find year."));
        System.out.println(minYear);   // 1988

        String name = employees.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getYearOfBirth() - o2.getYearOfBirth();
                    }
                })
                .map(employee -> employee.getName())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(name);   // Sós Helga

        boolean before = employees.stream()
                .allMatch(employee -> employee.getYearOfBirth() < 1980);
        System.out.println(before);    // false

        List<Employee> employeesBornBefore = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList());
        System.out.println(employeesBornBefore);

        List<String> employees1 = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employees1);     // [Fehér Ferenc, Sós Helga, Tóth Péter, Pintér Dorina, Kaszás Dénes, Kovács Fanni]

        List<String> employees2 = employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employees2);     // [Fehér Ferenc, Sós Helga, Kovács Fanni]
    }
}
