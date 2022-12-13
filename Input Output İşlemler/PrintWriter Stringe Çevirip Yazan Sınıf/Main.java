import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "ASDAÞKMDFAKLÞSKLQWDALSÞDMASÞD";
        try {
            PrintWriter writer = new PrintWriter("deneme.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}