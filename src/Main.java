import src.Employee;
import src.Manager;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Павел Ванин", "сотрудник",50000, 2023, 10, 15);
        employees[1] = new Employee("Мария Тимченко", "сотрудник",60000, 2022, 11, 20);
        employees[2] = new Employee("Виктор Баринов", "сотрудник",30000, 2024, 5, 10);
        employees[3] = new Manager("Анна Фроленкова", "руководитель", 80000, 2021, 12, 25);

        System.out.println("Зарплаты, до повышения :");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Manager.raiseSalary(employees);

        System.out.println("\nЗарплаты, после повышения :");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
