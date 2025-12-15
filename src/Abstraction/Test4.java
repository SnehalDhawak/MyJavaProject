package Abstraction;

//4) Overridable call inside constructor
abstract class Base
{
    Base()
    {
        show();
    }
    abstract void show();
}
class Derived extends Base
{
    int x = 10;
    Derived()
    {
        System.out.println("Derived ctor, x=" + x);
    }
    void show()
    {
        System.out.println("show, x=" + x);
    }
}
public class Test4 {
    public static void main(String[] args) {
        new Derived();
    }
}
