package Abstraction;

//3) Static vs instance order
abstract class P {
    static
    {
        System.out.println("P static");
    }
    {
        System.out.println("P instance");
    }
    P()
    {
        System.out.println("P ctor");
    }
}
class C extends P {
    static
    {
        System.out.println("C static");
    }
    {
        System.out.println("C instance");
    }
    C()
    {
        System.out.println("C ctor");
    }
}
public class Test3 {
    public static void main(String[] args) {
        System.out.println("Start");
        C obj = new C();
    }
}
