package Interface;

//Example 6: Functional interface with lambda
@FunctionalInterface
interface Calc {
    int op(int a, int b);
}
class T {
    public static void main(String[] args) {
        Calc add = (x, y) -> x + y;
        Calc max = (x, y) -> x > y ? x : y;
        System.out.println(add.op(2, 3) + " " + max.op(5, 1));
    }
}

