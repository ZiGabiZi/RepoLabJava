package task2;

import java.util.Random;
import java.util.Arrays;

public class Course {
    String name;
    double minimumGrade;
    Student[] students;

    public Course(String name, double minimumGrade, Student[] students) {
        this.name = name;
        this.minimumGrade = minimumGrade;
        this.students = students;
    }

    public Student chooseStudentRandomly(){
        Random aux = new Random();
        return students[aux.nextInt(students.length)];

    }



    public Student[] showAllPassingStudents() {
        Student[] passingStudents = new Student[students.length];
        int passingCount = 0;

        for (Student student : students) {
            if (student.grade >= minimumGrade) {
                passingStudents[passingCount] = student;
                passingCount++;
            }
        }

        Student[] result = new Student[passingCount];
        System.arraycopy(passingStudents, 0, result, 0, passingCount);
        return result;
    }


    public boolean isStudentPassing(int index){
        Student[] passingStudents = showAllPassingStudents();
        if(Arrays.asList(passingStudents).contains(students[index]))
            return true;
        else
            return false;
    }

    public boolean isStudentPassing(String nume){
        Student[] passingStudents = showAllPassingStudents();
        boolean X = false;
        for(int i=0;i<=students.length;i++){
            if(students[i].name == nume){
                X = true;
                break;
            }
        }
        return X;
    }




}


