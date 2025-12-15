package Interface;

import java.util.*;

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByIdDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.id - s1.id; // Descending order
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Priya"));

        Collections.sort(list, new SortByName()); // Sort by Name
        System.out.println("Sorted by Name:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }

        Collections.sort(list, new SortByIdDesc()); // Sort by Id (desc)
        System.out.println("\nSorted by Id Desc:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
