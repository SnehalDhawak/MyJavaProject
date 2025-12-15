package Interface;

import java.util.*;

public class StringComparable {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zebra", "Apple", "Mango", "Banana");

        Collections.sort(names);  // Alphabetical order

        System.out.println(names);
    }
}
