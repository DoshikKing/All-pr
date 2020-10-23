package com.company;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA())
        {
            return 1;
        }
        else if (o2.getGPA() < o1.getGPA())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}

