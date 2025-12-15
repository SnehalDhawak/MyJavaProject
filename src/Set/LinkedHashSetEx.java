package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String [] args) {

        HashSet<String> s = new LinkedHashSet<>();
        //Set<String> s = new LinkedHashSet<>();
        s.add("java");
        s.add(null);
        s.add("C");
        s.add("C++");
        s.add("java");	//ignore duplicate

        //insertion order guaranted
        System.out.println(s);
    }


}
