import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.print("12312412" + 123);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}