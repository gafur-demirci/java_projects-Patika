package BookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Sayfa sayısına göre ;

        TreeSet<Book> lset = new TreeSet<>(new OrderByPageNumberComparator());

        lset.add(new Book("Ali ata bak",125,"Ali","2014"));
        lset.add(new Book("denek",250,"ahmet","2004"));
        lset.add(new Book("Ali bul",315,"buse","1996"));
        lset.add(new Book("yüzüklerin efendisi",300,"eda","2000"));
        lset.add(new Book("the lord of the rings",250,"merva","2003"));

        System.out.println("Sayfa sayısına göre sıralama: ");


        for (Book book : lset){
            System.out.println(book.getBookName()  + " \t\t\t " + book.getAuthorName() + " \t " + book.getPageNumber() + " \t "+ book.getReleaseDate() );
        }
        System.out.println("----------------");

        //Kitap ismine göre ;

        TreeSet<Book> lset2 = new TreeSet<>(new OrderByNameComparator());

        lset2.add(new Book("Ali ata bak",125,"Ali","2014"));
        lset2.add(new Book("denek",250,"ahmet","2004"));
        lset2.add(new Book("Ali bul",315,"buse","1996"));
        lset2.add(new Book("yüzüklerin efendisi",300,"eda","2000"));
        lset2.add(new Book("the lord of the rings",250,"merva","2003"));

        System.out.println("Kitap adına göre sıralama: ");

        for (Book book : lset2){
            System.out.println(book.getBookName()  + " \t\t\t " + book.getAuthorName() + " \t " + book.getPageNumber() + " \t "+ book.getReleaseDate() );
        }

    }
}
