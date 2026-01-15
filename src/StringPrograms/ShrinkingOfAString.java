package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShrinkingOfAString {
    public static void main(String[] args) {
        //aabbbcc => a2b3c2

        String str = "aabbbcc";

        Map<Character,Integer> hashmap = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            System.out.println(hashmap.put(c, hashmap.getOrDefault(c,0)+1));
        }
        //System.out.println();

        StringBuilder result = new StringBuilder();
        System.out.println(hashmap.keySet());
        for( Character key :hashmap.keySet()){
            //System.out.print(key.toString()+hashmap.get(key));
            System.out.println("\n"+result.append(key).append(hashmap.get(key)));
        }
        System.out.println(result);
    }
}
