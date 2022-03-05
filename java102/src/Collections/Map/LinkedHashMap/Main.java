package Collections.Map.LinkedHashMap;

import Collections.Set.Student;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Student> students = new LinkedHashMap<>();

        students.put("101", new Student(101,"Ahmet",100));
        students.put("102", new Student(103,"Eda",80));
        students.put("103", new Student(105,"Ayşe",50));
        students.put("104", new Student(102,"Merve",40));

        for (Student stu : students.values()){
            System.out.println(stu.getName());
        }

    }

}
