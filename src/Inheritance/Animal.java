package Inheritance;
/*
//Single inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

//Multilevel inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
        p.bark();
        p.weep();
    }
}
*/
//Hierarchical inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("Animal eates a grass");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
    void sound() {
        System.out.println("Cat makes a sound");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.meow();
        c.eat();
        Animal A = new Cat();
        A.sound();
        A.eat();
    }
}
