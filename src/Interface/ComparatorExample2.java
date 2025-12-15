package Interface;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Priya", "Mohan", "Dev", "Automation");

        // Sort by length
        Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
        System.out.println("By length: " + names);

        // Sort alphabetically
        Collections.sort(names, String::compareTo);
        System.out.println("Alphabetical: " + names);
    }
}
