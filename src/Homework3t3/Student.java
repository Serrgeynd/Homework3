package Homework3t3;


public class Student {
    String firstName;
    String lastName;
    double averageMark;
    int Grant;

    public void getScholarship(){if (averageMark==5) Grant= 100;
    else Grant=80;
    }
    public  static void main(String[]args) {
        Student student = new Student();
        student.averageMark=4.9;
        student.getScholarship();
        System.out.println(student.Grant);



    }
}