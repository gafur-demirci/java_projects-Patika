public class Asistant extends Academician{

    private String officeHour;

    public Asistant(String nameSurname, String phoneNumber, String eposta, String department, String degree, String officeHour) {
        super(nameSurname, phoneNumber, eposta, department, degree);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void takeQuiz(){
        //
    }

    @Override
    public void attendClass() {
        System.out.println(this.getNameSurname() + " adlı asistan derse girdi.");
    }
}
