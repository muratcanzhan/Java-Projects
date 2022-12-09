import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(null);
        hSet.add(5);
        hSet.add(10);
        hSet.add(15);
        hSet.add(20);
        hSet.add(5);
       // hSet.remove(null);

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

      /*  for (Integer sayi : hSet) {
            System.out.println(sayi);
        }
       //   hSet.clear();

       */
        }
    }

}