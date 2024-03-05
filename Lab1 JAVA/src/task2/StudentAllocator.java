package task2;
import java.util.Random;

public class StudentAllocator {


    public static Student[] createStudents() {

        Student[] students = new Student[5];
        students[0] = new Student("John", 8.5);
        students[1] = new Student("Alice", 9.0);
        students[2] = new Student("Bob", 7.5);
        students[3] = new Student("Eva", 9.5);
        students[4] = new Student("Mike", 4.0);

        return students;
    }
}
