package Mylist;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        MyList<Integer> myList1 = new MyList<>();
//        myList1.add(5);

        Integer[] a = new Integer[2];
        a[0] = 5;
        a[1] = 10;
        MyList<Integer> myList1 = new MyList<>();

        System.out.println(myList1.size());
        System.out.println(myList1.getCapacity());
        myList1.add(10);
        myList1.add(20);
        myList1.add(30);
        System.out.println(myList1.size());
        System.out.println(myList1.getCapacity());
        myList1.add(40);
        myList1.add(50);
        myList1.add(60);
        myList1.add(70);
        myList1.add(80);
        myList1.add(90);
        myList1.add(100);
        System.out.println(myList1.getCounter());
        System.out.println(myList1.getLength());
        myList1.add(110);
        System.out.println(myList1.getCounter());
        System.out.println(myList1.getLength());
        System.out.println(myList1.size());
        System.out.println(myList1.getCapacity());
















//        Integer[] a = new Integer[2];
//        MyList<Integer> myList2 = new MyList<>(a);
//        MyList<Integer> myList3 = new MyList<>(5);
//        System.out.println(myList.getValue());
//        myList.lengthList(myList);
//        int[] ml = new int[5];
//        System.out.println(ml.length);
    }
}
