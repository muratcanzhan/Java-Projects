import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        String b = "10";
        Test<String> T = new Test<>(b);
        T.setObj(b);
    }
}