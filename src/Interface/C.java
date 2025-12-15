package Interface;
//Example 4: Class method wins over default
interface Log {
    default void print() {
        System.out.println("default");
    }
}
class Base {
    public void print() {
        System.out.println("class");
    }
}
class C extends Base implements Log {
    public static void main(String[] args) {
        new C().print();
    }
}
