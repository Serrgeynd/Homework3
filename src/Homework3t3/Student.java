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
}




