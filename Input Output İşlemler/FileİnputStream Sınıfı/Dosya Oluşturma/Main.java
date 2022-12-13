import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dosya = new File("asd.txt");
        try {
            dosya.createNewFile();
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + "Dosya oluşturuldu !");
            } else {
                System.out.println(dosya.getName() + "Dosyası zaten mevcut !");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }

    }
}