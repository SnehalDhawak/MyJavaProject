package AbstractClass;

//abstract class Base {
//    Base() {
//        System.out.println("Base()");
//        init();
//    }
//    abstract void init();
//}
//class Child extends Base {
//    private int x = 42;
//    Child(){
//        System.out.println("Child()"+ x);
//    }
//    void init() {
//        System.out.println("init x = " + x);
//    }
//}
public class Test1 {
    void sum() {
        System.out.println("Sum method");
    }
    public static void main(String[] args) {
        //new Child();
        System.out.println("Exception want to see");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Snehal".charAt(10));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("F block");
        }

        System.out.println("Exception saw");
    }
}