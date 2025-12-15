package Abstraction;

//7) Field hiding vs method overriding
abstract class Parent {
    int v = 1;
    abstract int get();
}
class Child extends Parent {
    int v = 2;
    int get() {
        return v;
    }
}
public class Test7 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.v);
        System.out.println(p.get());
    }
}

