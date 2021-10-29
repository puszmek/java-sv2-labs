package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Kiss Péter", 2016, 1_200_000);
        System.out.println("Name: " + employee.getName());
        System.out.println("Hiring year: " + employee.getHiringYear());
        System.out.println("Salary: " + employee.getSalary());

        employee.raiseSalary(100_000);
        employee.setName("Nagy Péter");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hiring year: " + employee.getHiringYear());
        System.out.println("Salary: " + employee.getSalary());
    }
}
