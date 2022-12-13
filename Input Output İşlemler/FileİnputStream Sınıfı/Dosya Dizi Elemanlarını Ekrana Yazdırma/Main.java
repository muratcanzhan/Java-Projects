import java.io.File;
public class Main {
    public static void main(String[] args) {
        File dizin = new File("Tester");

        String[] dizinlist = dizin.list();
        for (String str : dizinlist) {
            System.out.println(str);
        }

    }
}