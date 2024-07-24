import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;


public class TwiceData {
    public static void main(String[] args) {
        Scanner input;
        PrintWriter output;
        try {
            input =  new Scanner(new File("nums.txt"));
            output = new PrintWriter("twiceNums.txt");

            int num;

            while (input.hasNext()) {
                num = input.nextInt();
                output.println(num * 2);
            }
            input.close();
            output.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
