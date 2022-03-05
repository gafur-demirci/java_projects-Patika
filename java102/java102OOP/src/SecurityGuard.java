public class SecurityGuard extends Officer{

    private String document;

    public SecurityGuard(String nameSurname, String phoneNumber, String eposta, String department, String shift,String document) {
        super(nameSurname, phoneNumber, eposta, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void guardDuty(String startTime,String finishTime){
        System.out.println(this.getNameSurname() + " adlı güvenlik " + startTime + " da nöbete başladı ve "
                + finishTime + " da nöbeti bitecek.");
    }

    @Override
    public void Work() {
        System.out.println(this.getNameSurname() + " adlı güvenlik görevlisi çalışıyor.");
    }
}
