package ExceptionProgram;
//Unchecked exception-ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
