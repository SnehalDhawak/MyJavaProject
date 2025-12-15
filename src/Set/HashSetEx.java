package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String [] args) {

        //Set<String> s = new HashSet<>();
        HashSet<String> s = new HashSet<>();
        s.add("java");
        s.add(null);
        s.add("C");
        s.add("C++");
        s.add("java");	//ignore duplicate

        //insertion order not guaranted
        System.out.println(s);
    }


}
