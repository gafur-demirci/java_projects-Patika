package Collections.Map.TreeMap;

import Collections.Set.Student;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Student> students = new TreeMap<>(new OrderByNoComparator());

        students.put("110", new Student(101,"Ahmet",100));
        students.put("102", new Student(103,"Eda",80));
        students.put("105", new Student(105,"Ayşe",50));
        students.put("108", new Student(102,"Merve",40));

        for (Student stu : students.values()){
            System.out.println(stu.getName());
        }
    }
}
