package Interface;
//Example 5: Polymorphism via interface reference
interface Pay {
    void pay(double amt);
}
class UPI implements Pay {
    public void pay(double a){
        System.out.println("UPI "+a);
    }
}
class Card implements Pay {
    public void pay(double a){
        System.out.println("CARD "+a);
    }
}
class Test {
    static void checkout(Pay p){ p.pay(99); }
    public static void main(String[] args){
        checkout(new UPI());
        checkout(new Card());
    }
}
