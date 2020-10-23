package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        ArrayList iDNumber = new ArrayList();
        Student student1 = new Student(123456,"Petya",4);
        Student student2 = new Student(234567,"Kirill",3.4);
        Student student3 = new Student(100000,"Oleg",3.1);
        Student student4 = new Student(000111,"Umar",1);
        Student student5 = new Student(890678,"Gregory",2.4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.forEach(student -> iDNumber.add(student.getID()));
        Collections.sort(iDNumber);
        iDNumber.forEach(id -> System.out.println(id));

        Collections.sort(students, new SortingStudentsByGPA());
        students.forEach(student -> System.out.println(student));
    }
}
