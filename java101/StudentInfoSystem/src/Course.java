public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oral;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int oral = 0;

    }

    void addTeacher(Teacher teacher){
        //parametre olan teacher ın course prefix i uyumlu mu?
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}