package ExceptionProgram;

//Error StackOverflowError
public class StackOverflowErrorExample {
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred!");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
