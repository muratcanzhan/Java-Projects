import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("deneme.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while (i != -1){
                System.out.print((char) i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}