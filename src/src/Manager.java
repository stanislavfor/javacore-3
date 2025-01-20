package src;

public class Manager extends Employee {
    public Manager(String name, String job, double salary, int year, int month, int day) {
        super(name, job, salary, year, month, day);
    }

    public static void raiseSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() * 1.1);
            }
        }
    }
}
