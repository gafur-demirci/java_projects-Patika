public abstract class Officer extends Employee{

    private String department;
    private String shift;

    public Officer(String nameSurname, String phoneNumber, String eposta, String department, String shift) {
        super(nameSurname, phoneNumber, eposta);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public abstract void Work();

    @Override
    public void entery(){
        System.out.println(this.getNameSurname() + " adlı memur C kapısından giriş yaptı.");
    }
}
