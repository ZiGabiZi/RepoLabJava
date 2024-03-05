import task2.Course;
import task2.Student;
import task2.StudentAllocator;


public class Main {
    public static void main(String[] args) {
        //Task 2
        Student[] studenti = new StudentAllocator().createStudents();
        Course curs = new Course("OOP",5,studenti);
        Student studentAles = curs.chooseStudentRandomly();
        System.out.println("Student ales aleatoriu: " + studentAles.getName());

        Student[] studenti_trecuti = curs.showAllPassingStudents();
        System.out.println("Studenții care au trecut:");
        for (Student student : studenti_trecuti) {
            System.out.println("Nume: " + student.getName() + ", Notă: " + student.Getgrade());
        }

        System.out.print(curs.isStudentPassing(4));
        System.out.println();
        System.out.print(curs.isStudentPassing("Alice"));





    }
    }
