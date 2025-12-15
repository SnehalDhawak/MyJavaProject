package Interface;
//Example 3: Static methods are not inherited
interface Util {
    static int inc(int x) {
        return x + 1;
    }
}
class Demo implements Util {
    public static void main(String[] args) {
        System.out.println(Util.inc(5));
    }
}
