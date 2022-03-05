package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //İki tanımlamada kullanılabilir polymophism özelliğinden
        //ArrayList<Integer> liste2 = new ArrayList<>();
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(1);
        liste.add(10);
        liste.add(null);
        liste.add(1);
        liste.add(1);
        liste.add(1);

        List<Integer> liste2 = new ArrayList<>();
        liste2.add(1000);
        liste2.addAll(liste);
        System.out.println(liste2);

        liste.remove(6);

        List<Integer> liste3 = liste.subList(2,5);
        System.out.println(liste3);

        //kendi sıralayıcısı ile yazdırılabilir.
        //System.out.println(liste);

        Iterator<Integer> itr = liste.iterator();
        //while (itr.hasNext()){
        //    System.out.println(itr.next());
        //}

        System.out.println(liste.get(3));
        System.out.println(liste.get(0));

        // indexOf veya lastIndexOf -1 dönderiyorsa o değer listede yoktur demektir.
        System.out.println(liste.indexOf(1));
        System.out.println(liste.lastIndexOf(1));

        liste.add(2,15);
        liste.set(4,22);
        System.out.println(liste);

        // listeyi array e çevirme
        // array ile liste nin veri tipi aynı olmalı
        // içerisine belirtilen kadar elemanı alacak bir array oluşturur.
        //Object[] objectArr = liste.toArray();
        Integer[] ıntArr = liste.toArray(new Integer[6]);
        System.out.println(ıntArr[0]);

    }
}
