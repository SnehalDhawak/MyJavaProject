package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueElement2 {
    public static void main(String[] args){
        System.out.println("Unique elements using streams");
        System.out.println("using streams");
        Integer arr2[] = {4,2,7,2,4,4,9,1,7};
        List<Integer> list = Arrays.asList(arr2);
        list.stream().filter(e-> Collections.frequency(list,e)==1)
                .forEach(e-> System.out.println(e + " "));

    }
}
