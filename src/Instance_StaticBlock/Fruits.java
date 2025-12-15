package Instance_StaticBlock;

public class Fruits {
    static {
        System.out.println("Static block");
    }
    Fruits(){
        System.out.println("Constructor of fruits");
    }
    Fruits(int a){
        this();
        System.out.println("Parameterized constructor");
    }
    {
        System.out.println("Instance block");
    }
    void apple(){
        System.out.println("Instance method");
    }
    public static void main(String[] args){
        Fruits f = new Fruits(50);
        f.apple();
    }
}
