package com.ishwar.springboot.learnspringboot;

public class Course {

    private int id;
    private String courseName;
    private String instructor;

    public Course(int id, String courseName, String instructor) {
        this.id = id;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
