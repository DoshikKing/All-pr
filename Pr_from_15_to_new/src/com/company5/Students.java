package com.company5;

import java.util.Objects;

public class Students implements Get {
    int id;
    int gpa;
    String name;
    public Students(int id, int gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getGpa() {
        return this.gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return id == student.id && Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name);
    }

}
