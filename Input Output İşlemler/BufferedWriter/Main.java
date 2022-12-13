import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "ASDAÞKMDFAKLÞSKLQWDALSÞDMASÞD";

        File dosya = new File("dosya.txt");
        try {
            FileWriter writeFile = new FileWriter(dosya);
            BufferedWriter writeBuff = new BufferedWriter(writeFile);

            writeBuff.write(data);
            writeBuff.close();
            writeFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}