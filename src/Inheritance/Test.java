package Inheritance;
/*
//Upcasting and Downcasting in Java
class Animall {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogg extends Animall {
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog specific method: bark()");
    }
}

public class Test {
    public static void main(String[] args) {
        Animall a = new Dogg(); // Upcasting
        a.sound(); // Calls Dog's overridden method

       // a.bark(); // Not accessible - compile-time error
    }
}
*/
class Animall {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogg extends Animall {
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog specific method: bark()");
    }
}

public class Test {
    public static void main(String[] args) {
        Animall a = new Dogg(); // Upcasting
        a.sound();

        Dogg d = (Dogg) a; // Downcasting
        d.bark(); // Accessing Dog specific method
    }
}

