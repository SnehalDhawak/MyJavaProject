package Instance_StaticBlock;

class A{
    static
    {
        System.out.println("A static block");
    }
    {
        System.out.println("A non static block");
    }
    A()
    {
        System.out.println("A constructor");
    }
}
class B extends A
{
    static{
        System.out.println("B static block");
    }
    {
        System.out.println("B non static block");
    }
    B()
    {
        System.out.println("B constructor");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        B b = new B();
    }
}




