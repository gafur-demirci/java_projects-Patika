public class SIS {
    public static void main(String[] args){

        Teacher t1 = new Teacher("Mahmut Hoca","TRH","905454731252");
        Teacher t2 = new Teacher("Graham Bell","FZK","905481325496");
        Teacher t3 = new Teacher("Mimar Sinan","MMR","905473695741");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course mimar = new Course("Mimar","103","MMR");
        mimar.addTeacher(t3);

        Student s1 = new Student("Ali","123456","11",tarih,fizik,mimar,tarih,fizik,mimar);
        s1.addBulkExamNote(55,64,82,68,44,68);
        //s1.printNote();
        s1.isPass();

        Student s2 = new Student("Ayse","123444","12",tarih,fizik,mimar,tarih,fizik,mimar);
        s2.addBulkExamNote(66,83,45,88,75,39);
        s2.isPass();
    }
}
