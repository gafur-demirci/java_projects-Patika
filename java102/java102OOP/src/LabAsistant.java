public class LabAsistant extends Asistant{

    public LabAsistant(String nameSurname, String phoneNumber, String eposta, String department, String degree, String officeHour) {
        super(nameSurname, phoneNumber, eposta, department, degree, officeHour);
    }

    public void enterLabs(){
        System.out.println(this.getNameSurname() + " adlı lab asistanı lab'a girdi.");
    }

    @Override
    public void attendClass(){
        System.out.println(this.getNameSurname() + "adlı lab asistanı derse girdi.");
    }
}
