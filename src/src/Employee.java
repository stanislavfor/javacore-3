package src;

public class Employee {
    private String name;
    private String job;
    private double salary;
    private int year;
    private int month;
    private int day;

    public Employee(String name, String job, double salary, int year, int month, int day) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int compareDates(Employee other) {
        return Integer.compare(this.year * 10000 + this.month * 100 + this.day,
                other.year * 10000 + other.month * 100 + other.day);
    }

    public static void raiseSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() * 1.3);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                ": " + name +
                ", должность '" + job + "'" +
                ", salary : " + salary +
                ", дата договора : " + year + "-" + month + "-" + day +
                '}';
    }
}
