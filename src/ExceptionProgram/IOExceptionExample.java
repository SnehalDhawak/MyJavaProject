package ExceptionProgram;

import java.io.*;
//Checked Exceptions-IOException
public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello World!");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}