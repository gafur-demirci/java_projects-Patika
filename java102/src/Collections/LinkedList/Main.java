package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nameList = new LinkedList<>();
        nameList.add("Hale");
        nameList.add("Jale");
        nameList.add("Lale");
        nameList.add("Ahmet");
        nameList.add("Mehmet");
        nameList.add("Kemal");

        // get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
        System.out.println("Element of 2 index: " + nameList.get(2));

        // Liste başına eleman ekler
        //nameList.addFirst("Naz");
        //ayrıca yazılacak method

        // Liste sonuna eleman ekler
        //nameList.addLast("Ümit");
        //ayrıca yazılacak method
    }
}
