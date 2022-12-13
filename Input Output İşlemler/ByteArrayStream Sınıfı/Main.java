import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "Java IO Eğitim";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            System.out.println("Çıkış Akışı : " + output.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}