public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı");
        int a = 0, b = 10;
         try {
             System.out.println("Bölme işlemi");
             System.out.println(b / a);
             System.out.println("Bölme işlemi Bitti !");
         }
         catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }
         catch (Exception e) {
             System.out.println(e.getMessage());
         }
         finally {
             System.out.println("Kesin çalışacak Bölüm !");
         }
        System.out.println("Program Bitti.");
    }
}