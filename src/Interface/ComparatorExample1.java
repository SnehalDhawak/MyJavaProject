package Interface;

import java.util.*;

public class ComparatorExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        // Ascending order
        Collections.sort(numbers, (a, b) -> a - b);
        System.out.println("Ascending: " + numbers);

        // Descending order
        Collections.sort(numbers, (a, b) -> b - a);
        System.out.println("Descending: " + numbers);
    }
}
