package ExceptionProgram;

import java.io.FileNotFoundException;
import java.io.IOException;

//1. Null pointer exception
/*public class ExceptionHandlingPractice {
        public static void main(String args[]){
            String str= null;
            try {
                System.out.println("Length of string:"+ str.length());
            }
            catch (NullPointerException e){
                System.out.println("Get the auto generated msg:\n"+e.getMessage());
            }
        }
    }

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println("Won't print");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
        }
        System.out.println("After try-catch");
    }
}

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            a[2] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught AIOOBE");
        } finally {
            System.out.println("Finally executed");
        }
    }
}

public class ExceptionHandlingPractice {
    static int f() {
        try {
            return 1;
        }
        finally {
            return 2;
        } // overrides
    }
    public static void main(String[] args) {
        System.out.println(f());
    }
}

public class ExceptionHandlingPractice {
    static int g() {
        int x = 1;
        try { return x; }   // value 1 computed here
        finally {
            x = 2;
            System.out.println("x="+x);}  // does not affect already-computed return value
    }
    public static void main(String[] args) {
        System.out.println(g()); }
}

public class ExceptionHandlingPractice {
    static void ioTask() throws IOException {
        throw new IOException("Disk not reachable");
    }
    public static void main(String[] args) {
        try {
            ioTask();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}

public class ExceptionHandlingPractice {
    static void badInput() {
        throw new IllegalArgumentException("Negative size");
    }
    public static void main(String[] args) {
        try {
            badInput();
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        for (String s : new String[]{"10", "x"}) {
            try {
                int n = Integer.parseInt(s);
                int r = 10 / n;
                System.out.println("Result: " + r);
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Caught: " + e.getClass().getSimpleName());
            }
        }
    }
}

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            parse();
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName()
                    + ", cause=" + e.getCause().getClass().getSimpleName());
        }
    }
    static void parse() {
        try {
            Integer.parseInt("NaN");
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Parsing failed", e);
        }
    }
}
*/
//class Parent {
//    void read() throws IOException { /* ... */ }
//}
//
//// Valid: narrower checked exception
//class ChildOk extends Parent {
//    @Override void read() throws FileNotFoundException { /* ... */ }
//}
//
//// Valid: remove throws entirely
//class ChildAlsoOk extends Parent {
//    @Override void read() { /* ... */ }
//}
//public class ExceptionHandlingPractice {
//    public static void main(String []args)
//    {
//    }
//}
/*
public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            try {
                int[] a = new int[1];
                a[1] = 10; // inner handles
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner handled: " + e.getClass().getSimpleName());
            }
            int x = 10 / 0;   // outer handles
        } catch (ArithmeticException e) {
            System.out.println("Outer handled: " + e.getClass().getSimpleName());
        }
    }
}

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            System.exit(0);
        } finally {
            System.out.println("B");
        }
    }
}
*/
class Dev4 {
    public static void main (String[] args) {
        try{
            System.out.println("hey");
            System.out.println("hi");
            System.out.println("10/0");
        }
catch(ArithmeticException ae){ System.out.println(10/0); }
    System.out.println("rest of the code"); } }