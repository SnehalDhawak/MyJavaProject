package ExceptionProgram;
//Unchecked Exceptions
//ArithmeticException
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
