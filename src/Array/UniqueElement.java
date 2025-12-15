package Array;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args){
        int arr[]= {4,2,7,2,4,4,9,1,7};
        System.out.println("Unique elements using hashmap");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
                System.out.println(entry.getKey());
        }

        int arr1[] = {4,2,7,10,2,4,4,9,1,7};
        System.out.println("Unique elements using for loop");
        for (int i=0; i< arr1.length; i++){
            boolean isUnique=true;
            for (int j=0; j< arr1.length; j++){
                if (i!=j && arr1[i]==arr1[j]){
                    isUnique=false;
                    break;
                }
            }
            if (isUnique)
                System.out.println(arr1[i]);
        }
    }
}
