package Homework3t3;


public class Student {
    public String firstName;
    public String lastName;
    public double averageMark;
    public int grant;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;

    }

    public void getScholarship() {
        if (averageMark == 5) grant = 100;
        else grant = 80;
        System.out.println(grant);
    }

    public static void main(String[] args) {

        Student[] student = new Student[2];
        student[0] = new Student("Иван", "Иванов", 5);
        student[1] = new Aspirant("Василий", "Петров", 4.9, "Размножение кроликов");
        for (int i = 0; i < 2; i++) {
            student[i].getScholarship();


        }

    }
}

