package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 2, 4, 9, 1, 7};

        System.out.println("find duplicates without using any collection or predefined methods");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        System.out.println("==================================");
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicates.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(duplicates);

        System.out.println("========================================");

        System.out.println("find duplicates  using any hashset");
        //Set<Integer> duplicate = new HashSet<>();
        for( int number : arr){
            if(duplicates.add(number) == false)
                System.out.println(number);
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        HashMap<Integer, Integer> DuplicateHashMap = new HashMap<>();
        for (int num : arr) {
            if (DuplicateHashMap.containsKey(num)) DuplicateHashMap.put(num, DuplicateHashMap.get(num) + 1);
            else DuplicateHashMap.put(num, 1);
        }
        System.out.println("Printing duplicates using hashmap");
        for (int key : DuplicateHashMap.keySet()) {
            if (DuplicateHashMap.get(key) > 1)
                System.out.println(key);
        }

        System.out.println("Printing unique using hashmap");
        for(int key :DuplicateHashMap.keySet()){
            if(DuplicateHashMap.get(key) == 1){
                System.out.println(key);
            }
        }

        System.out.println("Printing numbers and their occurances using HashMap");
        for(int key :DuplicateHashMap.keySet()){
            System.out.println( "["+key +" - "+DuplicateHashMap.get(key)+"]");
        }

        System.out.println("Printing first duplicate using hashmap");
        for(int key :DuplicateHashMap.keySet()){
            if(DuplicateHashMap.get(key) > 1){   //2
                System.out.println(key);
                break;
            }
        }

        System.out.println("Printing duplicates by sort");
        int[] arr2 =  {1,4,5,6,1,6,6};
        Arrays.sort(arr2);
        for( int i = 0 ; i< arr2.length-1;i++){
            if(arr2[i]  == arr2[i+1]){
                System.out.println(arr2[i]);
            }
        }
    }
}
