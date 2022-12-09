import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new OrderNoteComprator().reversed()); // ====> SAYI KARŞILAŞTIRMALARI İÇİN.
        // TreeSet<Student> students = new TreeSet<>(new OrderNameComparator()); =====> İSİM KARŞILAŞTIRMALARI İÇİN.

        students.add(new Student("Murat", 75));
        students.add(new Student("Can", 20));
        students.add(new Student("Buket", 100));
        students.add(new Student("Zehra", 90));
        students.add(new Student("Özkan", 10));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }
    }
}

