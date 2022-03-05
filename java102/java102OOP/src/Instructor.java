public class Instructor extends Academician{

    private String doorNumber;

    public Instructor(String nameSurname, String phoneNumber, String eposta, String department, String degree,String doorNumber) {
        super(nameSurname, phoneNumber, eposta, department, degree);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public void entery(){
        System.out.println(this.getNameSurname() + " adlı öğretim görevlisi üniversiteye B kapısından giriş yaptı.");
    }

    @Override
    public void attendClass(){
        System.out.println(this.getNameSurname() + " adlı öğretim görevlisi derse girdi.");
    }
}
