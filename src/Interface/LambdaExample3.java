package Interface;

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class LambdaExample3 {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;

        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operation(5, 3));
        System.out.println("Multiplication: " + multiply.operation(5, 3));
    }
}