package Abstraction;

//8) Template Method pattern
abstract class TestTemplate {
    final void execute() {
        setUp(); body(); tearDown();
    }
    void setUp()   {
        System.out.println("Common setup");
    }
    abstract void body();
    void tearDown(){
        System.out.println("Common teardown");
    }
}
class LoginTest extends TestTemplate {
    void body() {
        System.out.println("Do login");
    }
}
public class Test8 {
    public static void main(String[] args) {
        new LoginTest().execute();
    }
}
