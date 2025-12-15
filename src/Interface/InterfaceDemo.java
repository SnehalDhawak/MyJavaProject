package Interface;
//Complete Interface Program:
// InterfaceDemo.java
interface Payment1 {
    // Constant (public static final by default)
    int MAX_LIMIT = 100_000;

    // Abstract contract (must be implemented by classes)
    void pay(int amount);

    // Default method (inherited by implementers; can be overridden)
    default void printReceipt(String payee, int amount) {
        System.out.println("Receipt: " + normalize(payee) + " paid ₹" + amount);
    }

    // Static utility method (invoked via interface name)
    static void version() {
        System.out.println("Payment API v1");
    }

    // Private helper (Java 9+) used within the interface
    private String normalize(String s) {
        return (s == null || s.isBlank()) ? "Customer" : s.trim();
    }
}

// Implementation #1: uses default receipt
class UpiPayment1 implements Payment1 {
    @Override
    public void pay(int amount) {
        System.out.println("UPI: processing payment of ₹" + amount);
    }
}

// Implementation #2: overrides default receipt
class CardPayment implements Payment1 {
    private final String last4;
    CardPayment(String last4) { this.last4 = last4; }

    @Override
    public void pay(int amount) {
        System.out.println("Card ****" + last4 + ": charged ₹" + amount);
    }

    @Override
    public void printReceipt(String payee, int amount) {
        System.out.println("Card Receipt -> " + (payee == null ? "Customer" : payee.trim())
                + " | Amount: ₹" + amount + " | ****" + last4);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment1.version(); // static method call

        Payment1 upi = new UpiPayment1();           // polymorphism via interface
        Payment1 card = new CardPayment("1234");   // second implementation

        upi.pay(500);
        upi.printReceipt("  Mohan  ", 500);       // default + private helper

        card.pay(1200);
        card.printReceipt(null, 1200);            // overridden default

        System.out.println("Max limit: ₹" + Payment1.MAX_LIMIT); // interface constant
    }
}
