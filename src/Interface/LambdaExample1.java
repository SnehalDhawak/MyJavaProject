package Interface;

public class LambdaExample1 {
    public static void main(String[] args) {
        // Before Java 8
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread running...");
            }
        };
        new Thread(r1).start();

        // With Lambda Expression
        Runnable r2 = () -> System.out.println("Thread running with Lambda...");
        new Thread(r2).start();
    }
}

