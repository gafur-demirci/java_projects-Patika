package Collections.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> p = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        p.add("Ali");
        p.add("Fazıl");
        p.add("Hülya");
        p.add("Betül");

        for (String s : p){
            System.out.println(s);
        }

    }
}
