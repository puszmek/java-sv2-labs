package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(2000, 06, 11, "Jane Doe");

        System.out.println("Allkalmazott neve: " + employee.getName());
        System.out.println("Születési dátuma: " + employee.getDateOfBirth());
        System.out.println("Belépés pillanata: " + employee.getBeginEmployment());

        employee.setName("Névváltoztatás: " + "Jane Boe");

        System.out.println("Alkalmazott adatai: " + employee.getName() + "  " + employee.getDateOfBirth() + "  " + LocalDateTime.now());
    }
}
