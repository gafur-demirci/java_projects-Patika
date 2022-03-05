package Collections.QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // FIFO
        Queue<String> q = new LinkedList<>();
        q.add("Ali");
        q.add("Serpil");
        q.add("Hasan");

        q.offer("Ali");

        //q.remove(); ilk sıradakini çıkarır.
        q.remove("Serpil");
        q.remove(2); // indexe göre çıkarma yok

        System.out.println(q.poll()); // ilk elemanı verir ve sıradan siler.
        System.out.println("******");
        System.out.println(q.peek()); // ilk elemanı verir ve sıradan silmez.
        Iterator<String> iter = q.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(q.element());
    }
}
