package Inheritance;
//Upcasting and downcasting and overriding
class Animal1{
    void sound(){
        System.out.println("Animal makes sound");
    }
    void run(){
        System.out.println("dogs running");
    }
}

class Dog1 extends Animal1{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    void bark(){
        System.out.println("Bark(): method");
    }
}

public class Test1 {
    public static void main(String[] args){
        Animal1 a1 = new Dog1();
        a1.sound();
        a1.run();

//        Dog1 b1 = (Dog1) a1;
//        ((Dog1) a1).bark();
//        a1.sound();
    }
}
