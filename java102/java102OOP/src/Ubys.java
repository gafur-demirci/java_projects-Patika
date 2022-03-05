public class Ubys {
    public static void main(String[] args) {

        //Employee e1 = new Employee("Hasan Huseyin","05205215152","hasan@huseyin.com");
        //e1.entery();
        //System.out.println(e1.getNameSurname());

        //Academician a1 = new Academician("Hüseyin Yazıcı","05205205052",
        //        "huseyin@yazici.com","Machine Engineering","Doc.");
        //System.out.println(a1.getPhoneNumber());
        //System.out.println(a1.getDegree());
        // abstract olduğu için nesnesi oluşturulamaz.
        //Officer o1 = new Officer("Ali Veli","05201231231","ali@veli.com","IK","09-17");
        //o1.Work();
        // bu şekilde üretilen nesnede nesneye özgü metoda erişemeyiz. Bunun için yukarıdaki kullanım gereklidir.
        //Employee o1 = new Officer("Ali Veli","05201231231","ali@veli.com","IK","09-17");
        //o1.Work();

        Instructor ı1 = new Instructor("Ali Yazgeldi","05205205153","ali@yazgeldi.com"
                ,"Energy Engineering","Prof.","12");

        //System.out.println(ı1.getDoorNumber());
        //ı1.entery();
        //ı1.attendClass();

        //e1.entery();
        //a1.entery();
        //o1.entery();
        ı1.entery();
        // Polymorphism de çalışanı akademisyen gibi davranmasını isteyebiliyoruz. Bu tanım şeklinde, akademisyenin override ettiği
        // ve çalışan sınıfına ait methodlara erişim iznine sahibiz , akademisyen sınıfına özgü(department) gibi methodlara erişim
        // sağlayamıyoruz.
        // Abstract olduğundan çalışmaz.
        //Employee e2 = new Academician("Ahmet Yavuz","05205135125","ahmet@yavuz.com","CENG","Yr. Doc.");
        //e2.entery();

        System.out.println("**************Polymorphism*************");

        //Employee[] loginEmployees = {e1,e2,a1,o1,ı1};
        //Employee.loginEmployees(loginEmployees);

        ı1.attendClass();

    }
}
