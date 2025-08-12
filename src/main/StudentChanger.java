package main;
public class StudentChanger {
    public static void changeStudentName(Student student, String newName) {
        student.name = newName;
    }

    public static void runChallenge() {
        Student student = new Student("Alex");
        System.out.println("Name before change: " + student.name);
        changeStudentName(student, "Jordan");
        System.out.println("Name after change: " + student.name);
    }
}