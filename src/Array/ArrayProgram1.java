package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProgram1 {
    public static void main(String[] args) {
        int[] arr = {11, 20, 33, 40, 59, 9};

        //First
        System.out.println("First Element:" + arr[0]);

        //Last
        System.out.println("Last Element:" +arr[arr.length-1]);

       /* //Print everything normal for loop
        for (int i= 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //for each loop
        for(int num: arr){
            System.out.println(num);
        }

        //Print numbers which are greater than 30
        System.out.println("Numbers greater than 30");
        for(int num: arr){
            if(num>30)
                System.out.println(num);
        }

        //Print array in reverse order
        System.out.println("Reverse order of Array");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        //Print even numbers using for each
        System.out.println("Even numbers");
        for(int num:arr){
            if(num%2==0)
                System.out.println(num);
        }
        //Print odd numbers using for each
        System.out.println("Odd numbers");
        for(int num:arr){
            if(num%2!=0)
                System.out.println(num);
        }
        //Print even numbers using for loop
        //int[] arr = {11, 20, 33, 40, 59, 9};
        System.out.println("Even numbers");
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0)
                System.out.println(arr[i]);
        }
        //Print even numbers using for loop
        System.out.println("Odd numbers");
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2!=0)
                System.out.println(arr[i]);
        }

        //find the sum of all numbers in an array using for each
        int sum=0;
        for(int number:arr){
            sum = sum + number; // sum+=number
        }
        System.out.println("Sum of the numbers in an array: "+sum);

        //find the sum of all numbers in an array using for loop
        int sum= 0;
        for(int i=0; i<arr.length;i++){
            sum= sum+ arr[i];
        }
        System.out.println("Sum of the numbers in an array: "+sum);

        // find the sum of all numbers in an array except 40 using for each
        int sumWithOut40 =0;
        for(int number:arr){
            if(number==40)
                continue;  //skip below lines
            //if(number!=40)
            sumWithOut40 = sumWithOut40 + number; // sum+=number
        }
        System.out.println("sumWithOut40:"+sumWithOut40);

        // find the sum of all numbers in an array except 40 using for each
        int sumWithOut40 =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==40)
                continue;  //skip below lines
            //if(arr[i]!=40)
               // continue;
            sumWithOut40 = sumWithOut40 + arr[i]; // sum+=number
        }
        System.out.println("sumWithOut40:"+sumWithOut40);

        //printing using streams
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        //printing array using while loop
        System.out.println("printing using while loop");
        int i=0;
        while(i<arr.length){
            if(arr[i]%2==0)
                System.out.println("this is even"+arr[i]);
            else
                System.out.println("this is odd"+arr[i]);
            i++;
        }

        //printing array using do while loop
        System.out.println("printing using Do while loop");
        int j=0;
        do{
            if(arr[j]%2==0)
                System.out.println("this is even"+arr[j]);
            else
                System.out.println("this is odd"+arr[j]);
            j++;
        }while(j<arr.length);

        // find the largest and smallest in an array using for each loop
        //what is input
        //what is expected output

        int largest = arr[0]; //33
        int smallest = arr[0]; //11

        for( int number :arr ){
            if( number > largest ) {
                largest = number;
            }
//            else if( number < smallest) {
//                smallest = number;
//            }
        }
        System.out.println("Large:"+largest);


        // find the largest and smallest in an array using for each loop
        int smallest= arr[0];
        int largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
                else if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("smallest:"+smallest+ "Largest:"+largest);

        //sort
        Arrays.sort(arr);
        System.out.println("this is printing by using Arrays utility class");
        System.out.println("smallest:"+ arr[0]+ " largest:"+arr[arr.length-1]);

        //missing number

        int[] arr2 = {1,2,3,4,6,7,8}; // 5

        // 1 3  = 4
        //1 2 3 = 6
        // 6- 4 = 2 is missing number
        //another logic
        //int n =8;
        //System.out.println(((n*(n+1))/2)-sumOfNumbers);
        int sumOfFirst8Numbers =0;
        for(int m=1; m <=8;m++){
            sumOfFirst8Numbers = sumOfFirst8Numbers + m;
        }

        int sumOfNumbers = 0;
        for( int number: arr2){
            sumOfNumbers = number + sumOfNumbers;
        }
        System.out.println(sumOfFirst8Numbers-sumOfNumbers);
*/
        //using set

        int[] arr3 = {1,2,3,4,5,7,8};
        Set<Integer> missingNumber = new HashSet<>();
        for(int ele: arr3){
            missingNumber.add(ele);
        }

        System.out.println("Missing numbers");
        for(int x= 1 ; x<=8; x++){
            if(!(missingNumber.contains(x)))
                System.out.println(x);
        }


    }

}