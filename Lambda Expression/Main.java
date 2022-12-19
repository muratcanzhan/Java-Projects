public class Main {
    public static void main(String[] args) {
        Matematik toplama = (a, b) -> a + b;
        Matematik cıkarma = (a, b) -> a - b;
        Matematik carpma = (a, b) -> a * b;
        Matematik bolme = (a, b) -> {
            if (b == 0) {
                b = 1;
            }
            return a / b;
        };

        System.out.println(toplama.transaction(10, 4));
        System.out.println(cıkarma.transaction(20, 4));
        System.out.println(carpma.transaction(30, 4));
        System.out.println(bolme.transaction(50, 4));

    }
}