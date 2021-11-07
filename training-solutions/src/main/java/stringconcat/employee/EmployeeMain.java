package stringconcat.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Kiss Péter", "driver", 400_000);

        System.out.println(employee.getName());
        System.out.println(employee.getJob());
        System.out.println(employee.getSalary() + " Ft");
        System.out.println(employee);
    }
}
