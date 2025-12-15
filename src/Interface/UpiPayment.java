package Interface;

interface Payment {
    void pay(double amount); // abstract method
    default String currency() {
        return "INR";
    }
    static boolean isValidAmount(double a) {
        return a >= 0;
    }
    private void log(String msg) {
        /* helper */
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPI");
    }
    public static void main(String[] args){
        UpiPayment up = new UpiPayment();
        up.pay(2.5);
        up.currency();
    }
}

