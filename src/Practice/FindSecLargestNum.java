package Practice;

//1st way
//public class FindSecLargestNum {
//    public static void main(String[] args) {
//        int arr[] = {99, 54, 100, 43, 89, 63, 6, 78};
//        int largest = arr[0];
//        int seclarg = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                seclarg = largest;
//                largest = arr[i];
//
//            } else if (arr[i] > seclarg && arr[i]!=largest) {
//                seclarg = arr[i];
//            }
//        }
//        System.out.println("1st largest num:"+largest);
//        System.out.println("2nd largest num:"+seclarg);
//    }
//}

import java.util.Arrays;

//2nd way
public class FindSecLargestNum {
    public static void main(String[] args) {
        int arr[] = {99, 54, 100, 43, 89, 63, 6, 78};
        Arrays.sort(arr);
        System.out.println("1st largest num:"+arr[arr.length-1]);
        System.out.println("2nd largest num:"+arr[arr.length-2]);
    }
}
