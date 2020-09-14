package Homework3t3;

public class Aspirant extends Student {
    String Study;


    @Override
    public void getScholarship() {
        if (averageMark == 5) Grant = 200;
        else Grant = 180;
    }


    public static void main(String[] args) {
        Student student = new Aspirant();
        student.averageMark=5.0;
        student.getScholarship();
        System.out.println(student.Grant);


    }
}

