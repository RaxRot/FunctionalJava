package streams.allmatch;

import java.util.Arrays;
import java.util.List;


class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class StreamAllMatchExample {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1,"Vlad",2000),
                    new Employee(2,"Roma",5000),
                    new Employee(3,"Ola",7000)
            );
            boolean allSalaryMoreThat5k=employees.stream().allMatch(employee -> employee.getSalary()>50000);
            boolean allSalaryMoreThan1k=employees.stream().allMatch(employee -> employee.getSalary()>1000);
            System.out.println(allSalaryMoreThat5k);
            System.out.println(allSalaryMoreThan1k);
        }
}

