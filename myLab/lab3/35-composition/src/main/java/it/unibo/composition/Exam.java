package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(
        int id,
        int maxStudents,
        String courseName,
        Professor professor,
        ExamRoom room
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this. registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor; 
        this.room = room;
        this.students = new Student[this.maxStudents];
    }

    public void registerStudent(Student student) {
        if(this.registeredStudents < this.students.length) {
            this.registeredStudents = this.registeredStudents + 1;
            this.students[this.registeredStudents-1] = student;
        } else {
            System.out.println("Registration max limit reached");
        }
    }

    public String toString() {
        return "Exam ["
        + " Id: " + this.id + ", "
        + "Registered Students: " + this.registeredStudents + ", "
        + "Course name: " + this.courseName + ", "
        + "Professor: " + this.professor.getUsername() + ", "
        + "Room: " + this.room.getDescription() + ", "
        + "Students: " + Arrays.toString(this.students);
    }

}
