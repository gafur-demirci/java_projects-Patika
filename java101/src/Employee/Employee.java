package Employee;

public class Employee {

    private String name;
    private int salary,workHours,hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public int bonus(){
        int bonus = 0;
        if (this.workHours > 40){
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary(){
        int time = 2021 - this.hireYear;
        double raiseSalary = 0;
        if (time < 10){
            raiseSalary=this.salary * 0.05;
        }else if(time < 20){
            raiseSalary=this.salary * 0.1;
        }else{
            raiseSalary=this.salary * 0.15;
        }
        return raiseSalary;
    }

    public void toStringEmp(){
        System.out.println("Adı: " + this.getName() + "\n" +
                "Maaşı: " + this.getSalary() + "\n"+
                "Çalışma saati: " + this.getWorkHours() + "\n"+
                "Başlangıç yılı: " + this.getHireYear() + "\n"+
                "Vergi: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() + "\n"+
                "Maaş artışı: " + this.raiseSalary() + "\n"+
                "Vergi ve bonuslar ile maaşınız: " + (this.getSalary() + this.bonus() - this.tax()) + "\n"+
                "Toplam maaş: " + (this.raiseSalary() + this.getSalary()));

    }








}
