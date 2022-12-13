import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("deneme.txt");
            System.out.println("Kullanılabilir Byte Sayısı :" + input.available());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}