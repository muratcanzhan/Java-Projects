import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("deneme.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            System.out.println(inputStreamReader.getEncoding());
            int i = inputStreamReader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStreamReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}