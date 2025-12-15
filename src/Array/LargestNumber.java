package Array;

public class LargestNumber {
    public static void main(String[] args){
        int []arr= {11,10,8,100,9,2,50};

        //first largest number
        int max= arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //second largest number
        int first= Integer.MIN_VALUE;
        int second= Integer.MAX_VALUE;
        for(int num: arr){
            if (num>first){
                second=first;
                first=num;
            }
            else if (num>second && num!=first)
                second=num;
        }
        System.out.println(second);
    }
}
