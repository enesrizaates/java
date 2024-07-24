import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class FileOutputFun {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello there!");
            pw.println("My name is John Doe");
            pw.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        }
    }
}
