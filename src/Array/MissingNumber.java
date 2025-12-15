package Array;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 7, 8, 9, 10};

        for (int i=1; i<=10; i++){
            boolean found= false;
            for (int j: arr){
                if (i==j)
                    found= true;
            }
            if (found==false)
                System.out.println(i);
        }
    }
}
