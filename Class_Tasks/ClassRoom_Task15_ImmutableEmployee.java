package ClassRoom_Tasks;

final class Employee {

    private final String employeeId;
    private final String name;
    private final double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee giveRaise(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Raise amount must be positive");
        }
        return new Employee(employeeId, name, salary + amount);
    }
}

public class ClassRoom_Task15_ImmutableEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee("E1", "Priya", 50000);

        Employee emp2 = emp1.giveRaise(5000);

        System.out.println("Original Salary: " + emp1.getSalary());
        System.out.println("New Salary: " + emp2.getSalary());
    }
}
