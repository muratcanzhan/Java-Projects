import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "ASDA�KMDFAKL�SKLQWDALS�DMAS�D";
        try {
            PrintWriter writer = new PrintWriter("deneme.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}