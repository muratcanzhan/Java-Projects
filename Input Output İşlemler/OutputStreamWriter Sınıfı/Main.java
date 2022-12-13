import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "ðüqwüðþqfðiasöç";

        try {
            FileOutputStream fileOutput = new FileOutputStream("deneme.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);

            System.out.println(fileWriter.getEncoding());
            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}