public class Main {
    public static void main(String[] args){

        Book harryPotter = new Book("Harry Potter",250);
        Book nasreddinHodja = new Book("Nasrettin Hoca",-500);

        System.out.println(harryPotter.getshowName());
        System.out.println(harryPotter.getshowPageNumber());

        System.out.println("********");

        harryPotter.setchangeName("Heri potır");
        System.out.println(harryPotter.getshowName());

        System.out.println("********");

        harryPotter.setchangePageNumber(350);
        System.out.println(harryPotter.getshowPageNumber());

        System.out.println("********");

        System.out.println(nasreddinHodja.getshowName());
        System.out.println(nasreddinHodja.getshowPageNumber());

        System.out.println("********");

        nasreddinHodja.setchangeName("Nazrettin Hoça");
        System.out.println(nasreddinHodja.getshowName());

        System.out.println("********");

        nasreddinHodja.setchangePageNumber(450);
        System.out.println(nasreddinHodja.getshowPageNumber());
    }
}
