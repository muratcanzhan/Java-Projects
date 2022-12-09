import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(10);
        liste.add(15);
        liste.add(25);
        liste.add(5);
        liste.add(5);

        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2.addAll(liste);
        

        liste.add(2, 15);

        liste.set(1, null);

        liste.remove(5);

        System.out.println(liste.contains(10));

        System.out.println(liste.size());

        System.out.println(liste.get(2));

        System.out.println(liste.lastIndexOf(5));

        Iterator ıtr = liste.iterator();

        while (ıtr.hasNext()) {
            System.out.println(ıtr.next());
        }

        for (Integer elm : liste) {
            System.out.println(elm);

        }
    }
}

