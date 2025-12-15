package Abstraction;

//10) Field initializers vs constructor body
abstract class BaseX {
    BaseX() {
        System.out.println("BaseX ctor: " + val());
    }
    abstract int val();
}
class SubX extends BaseX {
    int x = compute();
    int compute() {
        System.out.println("compute()");
        return 42;
    }
    SubX() {
        System.out.println("SubX ctor: " + x);
    }
    int val() {
        return x;
    }
}
public class Test10 {
    public static void main(String[] args) {
        new SubX();
    }
}
