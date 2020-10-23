package com.company;

public class Student {
    private static int counter = 0;
    private int ID;
    private double GPA = -1;
    private String name;

    void setGPA(double GPA) {
        if (0.0 <= GPA && GPA <= 4.0)
            this.GPA = GPA;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    double getGPA() {
        return GPA;
    }

    String getName() {
        return name;
    }

    public Student(int ID, String name, double GPA) {
        this.ID = ID;
        setName(name);
        setGPA(GPA);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                '}';
    }
}