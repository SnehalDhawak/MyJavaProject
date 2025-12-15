package Interface;

import java.util.*;
/*
class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;  // Sorting by ID
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Mohan"));
        employees.add(new Employee(101, "Priya"));
        employees.add(new Employee(102, "Reddy"));

        Collections.sort(employees);  // Uses compareTo()

        System.out.println(employees);
    }
}
*/
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural ordering by id
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Priya"));

        Collections.sort(list); // Uses compareTo
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
