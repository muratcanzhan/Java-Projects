import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "ðüqwüðþqfðiasöçlasndmöaasdaklþsfklþasdklþfhjaskdasdmlþ";

        try {
            FileWriter fileWriter = new FileWriter("deneme.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}