import java.util.ArrayList;
import java.util.List;

public class Employees{

    static class Employee
    {
        private String name;
        private int age;

        Employee(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        int getAge()
        {
            return age;
        }

        @Override
        public String toString()
        {
            return name + ": " + age;
        }
    }

    public static void main(String[] args) 
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Fia FIgen", 21));
        employees.add(new Employee("Nindy JUniar A",20)); 
        employees.add(new Employee("Dea Nur", 20)); 
        employees.add(new Employee("Nungkii", 20));
        printEmployee1(employees, 50);
        System.out.println();
        printEmployee2(employees, 50);
    }

    public static void printEmployee1(List<Employee> employees, int age)
    {
        for (Employee emp : employees)
            if (emp.getAge() < age)
            System.out.println(emp);
    }

    public static void printEmployee2(List<Employee> employees, int age)
    {
        employees.stream()
            .filter(emp -> emp.age < age)
            .forEach(emp -> System.out.println(emp));
    }
}