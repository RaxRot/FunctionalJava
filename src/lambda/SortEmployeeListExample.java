package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SortEmployeeListExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Vlad", 29, 100));
        employees.add(new Employee(2, "Nadiia", 23, 50));
        employees.add(new Employee(3, "Daria", 34, 250));
        employees.add(new Employee(4, "Oleg", 45, 75));

        Comparator<Employee>employeeSalaryComparator = (o1, o2) ->o1.getSalary() - o2.getSalary();
        employees.sort(employeeSalaryComparator);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("--------");

        Comparator<Employee>employeeNameComparator = (o1, o2) ->o1.getName().compareTo(o2.getName());
        employees.sort(employeeNameComparator);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("--------");
        Comparator<Employee>employeeAgeComparator = (o1, o2) ->o1.getAge() - o2.getAge();
        employees.sort(employeeAgeComparator);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort((o1, o2) -> o1.getSalary() - o2.getSalary());
        employees.sort( (o1,o2)->o1.getName().compareTo(o2.getName()));
    }
}
