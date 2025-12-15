package Interface;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class ComparatorExample3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Priya", 60000));
        list.add(new Employee(2, "Mohan", 75000));
        list.add(new Employee(3, "Dev", 50000));

        // Sort by Salary (Ascending)
        Collections.sort(list, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("By Salary Asc: " + list);

        // Sort by Name
        Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("By Name: " + list);
    }
}