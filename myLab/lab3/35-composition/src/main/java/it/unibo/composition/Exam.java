package it.unibo.composition;

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
        ExamRoom room,
        Student[] students
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this. registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor; 
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public void registerStudent(Student student) {
        for(int i = 0; i<) {
            if(index == null) {
                students[index] = student;
            }
        } 
    }
}
