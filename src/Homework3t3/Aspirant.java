package Homework3t3;

public class Aspirant extends Student {
    public String study;

    public Aspirant(String firstName, String lastName, double averageMark, String study) {
        super(firstName,
                lastName,
                averageMark);
        this.study = study;
    }


    @Override
    public void getScholarship() {
        if (averageMark == 5) {
            grant = 200;
        } else {
            grant = 180;
        }
        System.out.println(grant);
    }
}




