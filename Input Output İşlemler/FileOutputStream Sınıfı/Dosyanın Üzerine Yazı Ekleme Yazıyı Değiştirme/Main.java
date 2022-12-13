import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yazi = "Eklenecek Yazı Deneme 123\n";
        File dosya = new File("deneme.txt");
        try {
            FileOutputStream output = new FileOutputStream(dosya,true);  //true silinirse üstüne yazar.
            byte [] yazıByte = yazi.getBytes();
            output.write(yazıByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}