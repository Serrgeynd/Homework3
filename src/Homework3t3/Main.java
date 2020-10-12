package Homework3t3;

public class Main {
    public static void main(String[]args){
        Student[] student = new Student[2];
        student[0] = new Student("Иван", "Иванов", 5);
        student[1] = new Aspirant("Василий", "Петров", 4.9, "Размножение кроликов");
        for (int i = 0; i < 2; i++) {
            student[i].getScholarship();
    }
}}
