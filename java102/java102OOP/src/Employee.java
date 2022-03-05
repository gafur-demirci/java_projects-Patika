public abstract class Employee {
    private String nameSurname;
    private String phoneNumber;
    private String eposta;

    Employee(String nameSurname, String phoneNumber, String eposta){
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.eposta = eposta;

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void entery(){
        System.out.println(this.getNameSurname() + " adlı çalışan üniversiteye giriş yaptı.");
    }

    public void exit(){
        System.out.println(this.getNameSurname() + " üniversiteye çıkış yaptı.");
    }

    public void refectory(){
        System.out.println(this.getNameSurname() + " yemekhaneye giriş yaptı.");
    }

    public static void loginEmployees(Employee[] loginEmp){
        for (Employee emp: loginEmp) {
            emp.entery();
        }
    }
}
