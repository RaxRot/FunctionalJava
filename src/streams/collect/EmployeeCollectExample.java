package streams.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class EmployeeCollectExample {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Vlad", 35));
        employees.add(new Employee("Nadiia", 10));
        employees.add(new Employee("Vlad", 35));

        List<Integer>ages=employees.stream().map(Employee::getAge).collect(Collectors.toList());
        List<String>names=employees.stream().map(employee->employee.getName()).collect(Collectors.toList());
    }
}
