import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz: ");
        int age = scanner.nextInt();
        checkAge(age);
        System.out.println("Program bitti");
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Yaşınız Tutmuyor!!!");
        }
        System.out.println("Yaşınız Uygundur.");
    }
}