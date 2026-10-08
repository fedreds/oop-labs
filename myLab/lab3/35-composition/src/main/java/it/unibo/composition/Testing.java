package it.unibo.composition;

public class Testing {

    public static void main() {

        // 1)Creare 3 studenti a piacere
        Student gigioCampana = new Student(1, "Gigio", "Campana", "capperi", 1204);
        Student carloGiovanni = new Student(2, "Carlo", "Giovanni", "capperini", 1921);
        Student giorgioForesta = new Student(3, "Giorgio", "Foresta", "capperotti", 2026);
        // 2)Creare 2 docenti a piacere
        Professor belloFigo = new Professor(4, "Bello", "Figo", "cavolo", new String[] {"OOP"});
        Professor jerryScotti = new Professor(5, "Gerry", "Scotti", "cavoletti", new String[] {"Gabibbo"});
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(20, null, false, false);
        ExamRoom room2 = new ExamRoom(50, null, false, false);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam exam1 = new Exam(6,10,"OOP", belloFigo, room1);
        Exam exam2 = new Exam(7,2, "Gabibbo", jerryScotti, room2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registerStudent(gigioCampana);
        exam1.registerStudent(carloGiovanni);
        exam1.registerStudent(giorgioForesta);
        exam2.registerStudent(gigioCampana);
        exam2.registerStudent(carloGiovanni);
        exam2.registerStudent(giorgioForesta);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1.toString());
        System.out.println(exam2.toString());
    }
}
