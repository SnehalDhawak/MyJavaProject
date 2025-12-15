package Interface;

import java.util.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Priya", "Mohan", "Reddy", "Dev");

        // Without Lambda
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted (old way): " + names);

        // With Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted (Lambda way): " + names);
    }
}
