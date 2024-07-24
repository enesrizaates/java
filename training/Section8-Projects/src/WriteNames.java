import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        names.add("Smith");
        names.add("Jackie");

        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for (String name : names) {
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        }
    }
}
