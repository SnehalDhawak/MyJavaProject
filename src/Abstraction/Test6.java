package Abstraction;

//6) Final method in abstract class
abstract class Engine {
    final void start() {
        System.out.println("Engine start");
    }
    abstract void run();
}
class PetrolEngine extends Engine {
    void run() {
        System.out.println("Petrol run");
    }
}
public class Test6 {
    public static void main(String[] args) {
        Engine e = new PetrolEngine();
        e.start();
        e.run();
    }
}