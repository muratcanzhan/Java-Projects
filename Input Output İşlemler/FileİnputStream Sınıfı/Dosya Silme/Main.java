import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dosya = new File("asd.txt");
        System.out.println(dosya.delete());
    }
}