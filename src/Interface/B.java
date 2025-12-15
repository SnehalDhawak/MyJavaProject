package Interface;

//Example 1: Fields are constants
interface A {
    int X = 10; }
class B implements A {
    public static void main(String[] args) {
        System.out.println(X);
    }
}