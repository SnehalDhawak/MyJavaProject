package Abstraction;

//5) Static method hiding
class R
{
    static void ping()
    {
        System.out.println("A.ping");
    }
}
class S extends R {
    static void ping()
    {
        System.out.println("B.ping");
    }
}
public class Test5 {
    public static void main(String[] args) {
        R.ping();
        S.ping();
        R ref = new S();
        ref.ping();
    }
}
