package it.unibo.composition;

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

    public String toString() {
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + for(String elem : courses) {
                IO.println(elem + " ");
            }
            + "]";
    }
    public String getUsername() {
        return name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        
    }

}
