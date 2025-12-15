package Interface;

import java.util.*;

public class ReverseComparable {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(numbers);
    }
}