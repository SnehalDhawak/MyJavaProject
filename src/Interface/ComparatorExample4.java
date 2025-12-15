package Interface;

import java.util.*;

public class ComparatorExample4 {
    public static void main(String[] args) {
        Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();

        TreeSet<String> set = new TreeSet<>(lengthComparator);
        set.add("Priya");
        set.add("Mohan");
        set.add("Dev");
        set.add("Automation");

        System.out.println("TreeSet (by length): " + set);
    }
}
