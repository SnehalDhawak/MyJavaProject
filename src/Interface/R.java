package Interface;

//Example 2: Default method conflict
interface P {
    default void hi() {
        System.out.println("P");
    }
}
interface Q {
    default void hi() {
        System.out.println("Q");
    }
}
class R implements P, Q {
    public void hi() {
        Q.super.hi();
    }
    public static void main(String[] args) {
        new R().hi();
    }
}