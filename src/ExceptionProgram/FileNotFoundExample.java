package ExceptionProgram;

import java.io.*;
//Checked Exceptions-FileNotFoundException
public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("non_existing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

