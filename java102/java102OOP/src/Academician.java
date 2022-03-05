public abstract class Academician extends Employee{

    private String department;
    private String degree;

    public Academician(String nameSurname, String phoneNumber, String eposta, String department, String degree) {
        super(nameSurname, phoneNumber, eposta);
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public abstract void attendClass();
    @Override
    public void entery(){
        System.out.println(this.getNameSurname() + " adlı akademisyen üniversiteye A kapısından giriş yaptı.");
    }
}
