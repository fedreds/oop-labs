package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {

    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor (
        int id,
        String name,
        String surname,
        String password,
        String[] courses
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public String getUsername() {
        return this.name + " " + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + Arrays.toString(this.courses)
            + "]";
    }

    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String [] courses) {
        this.courses = new String[courses.length];
        for (int i = 0; i < this.courses.length; i++) {
            this.courses[i] = courses[i];
        }
    }

}
