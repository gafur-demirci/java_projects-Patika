public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course o1;
    Course o2;
    Course o3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course o1, Course o2, Course o3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2,int note3,int oral1,int oral2,int oral3){
        if (note1 >= 0 && note1 <=100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <=100){
            this.c3.note = note3;
        }
        if (oral1 >= 0 && oral1 <= 100){
            this.c1.oral = oral1;
        }
        if (oral2 >= 0 && oral2 <= 100){
            this.c2.oral = oral2;
        }
        if (oral3 >= 0 && oral3 <= 100){
            this.c3.oral = oral3;
        }

    }

    void  isPass(){
        System.out.println("========================");
        this.average = (((this.c1.note*0.6 + this.c1.oral*0.4) /2) + ((this.c2.note*0.8 + this.c2.oral*0.2) / 2) + ((this.c3.note*0.5 + this.c3.oral*0.5)/2))/ 3.0;
        if (this.average > 55){
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;

        }else{
            System.out.println("Seneye tekrar görüşürüz.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu :\t" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü :\t" + this.c1.oral);
        System.out.println("==================================");
        System.out.println(this.c2.name + " Notu :\t" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü :\t" + this.c2.oral);
        System.out.println("==================================");
        System.out.println(this.c3.name + " Notu :\t" + this.c3.note);
        System.out.println(this.c3.name + " Sözlü :\t" + this.c3.oral);
        System.out.println("==================================");
        System.out.println("Ortalamanız :\t" + this.average);
    }
}
