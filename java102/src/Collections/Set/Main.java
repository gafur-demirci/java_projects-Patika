package Collections.Set;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(5);
        hSet.add(12);
        hSet.add(22);
        hSet.add(22);
        hSet.add(22);
        hSet.add(32);

        // tekrar edenler aynı alan koduna sahip olduğu için bir kere yazılıyor ve
        // sırasız bir şekilde ekrana çıkarılıyor. Girilen değer sırası değil üretilen hash in sıralamasına göre k > b
        // foreach ile yazdırabiliriz veya iterator kullanarak da yazdırabiliriz.
        hSet.remove(5);
        for(Integer num : hSet){
            System.out.println(num);
        }
        // Iterator ile hashSet yazdırma.
        // Iterator sınıfından bir nesne oluşturup onu hashSet in iteratorına atarız
        // sonra while ile döngü yazılır hasNext fonk bir sonraki yerde veri var mı diye bakar ve varsa true yoksa false
        // döndürür. Sonra ıtr.next() ile değeri yakalar ve yazdırırız.
        Iterator<Integer> ıtr = hSet.iterator();
        while(ıtr.hasNext()){
            System.out.println(ıtr.next());
        }


        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(5));

        System.out.println("####################################");

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(5);
        lSet.add(12);
        lSet.add(22);
        lSet.add(22);
        lSet.add(22);
        lSet.add(32);

        lSet.remove(5);

        // tekrar edenler aynı alan koduna sahip olduğu için bir kere yazılıyor ve
        // sıralı bir şekilde ekrana çıkarılıyor. Girilen değer sıralamasına göre
        // foreach ile yazdırabiliriz veya iterator kullanarak da yazdırabiliriz.
        for(Integer num : lSet){
            System.out.println(num);
        }
        // Iterator ile hashSet yazdırma.
        // Iterator sınıfından bir nesne oluşturup onu hashSet in iteratorına atarız
        // sonra while ile döngü yazılır hasNext fonk bir sonraki yerde veri var mı diye bakar ve varsa true yoksa false
        // döndürür. Sonra ıtr.next() ile değeri yakalar ve yazdırırız.
        ıtr = lSet.iterator();
        while(ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

        System.out.println(lSet.size());
        System.out.println(lSet.isEmpty());
        System.out.println(lSet.contains(5));*/

//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
        students.add(new Student(10,"Ali", 100));
        students.add(new Student(11,"Ayse", 55));
        students.add(new Student(12,"Bihter", 80));
        students.add(new Student(13,"Zeynep", 40));
        students.add(new Student(14,"Leyla", 100));

        for(Student stu : students){
            System.out.println(stu.getName());
        }

    }
}
