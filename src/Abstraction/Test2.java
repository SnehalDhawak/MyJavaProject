package Abstraction;

//2) Constructor chaining
abstract class A {
    A() {
        System.out.println("A()");
    }
}
class B extends A {
    B() {
        System.out.println("B()");
    }
}
public class Test2 {
    public static void main(String[] args) {
        new B();
    }
}

