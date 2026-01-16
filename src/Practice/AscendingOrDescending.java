package Practice;

public class AscendingOrDescending {
    public static void main(String[] args){
    //Ascending Descending check
    int[] arr = {-20,1,3,7,11};
    boolean isAscending = true;
    boolean isDescending = true;
for (int i=0;i<arr.length-1;i++) {
        if(arr[i]>arr[i+1]) isAscending = false;
        if(arr[i]<arr[i+1]) isDescending = false;
    }
if(isAscending)
            System.out.println("Ascending");
else if (isDescending)
            System.out.println("Descending");
    }
}
