package Interface;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 10, 30, 20, 40);

        Collections.sort(numbers);  // Natural ascending order

        System.out.println(numbers);
    }
}