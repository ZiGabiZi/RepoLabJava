import java.util.List;
import java.util.ArrayList;
import task1.Student;

//Pentru realizarea problemei am folosit design patternul Strategy

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aurel Vlaicu", 5.3, 7.8, 9.0));
        students.add(new Student("Liviu Teodorescu", 7.7, 5.2, 9.0));

        StudentSorter sorter = new StudentSorter();

        sorter.setSortingStrategy(new SortByTotalGrade());
        sorter.performSort(students);
        printStudents(students, "Sortare după cea mai mare notă totală");

        sorter.setSortingStrategy(new SortByPartialGrade());
        sorter.performSort(students);
        printStudents(students, "Sortare după cea mai mare notă la parțial");

        sorter.setSortingStrategy(new SortByAverageGrade());
        sorter.performSort(students);
        printStudents(students, "Sortare după media notelor");
    }

    public static void printStudents(List<Student> students, String sortMethod) {
        System.out.println(sortMethod);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.printf("%d. %s %.1f %.1f %.1f%n", i + 1, student.getNume(), student.getNota_lab(), student.getNota_partial(), student.getNota_examen());
        }
        System.out.println();
    }
}

interface SortingStrategy {
    void sort(List<Student> students);
}

class StudentSorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(List<Student> students) {
        sortingStrategy.sort(students);
    }
}

class SortByTotalGrade implements SortingStrategy {
    @Override
    public void sort(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.get_nota_Totala(), s1.get_nota_Totala()));
    }
}

class SortByPartialGrade implements SortingStrategy {
    @Override
    public void sort(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.getNota_partial(), s1.getNota_partial()));
    }
}

class SortByAverageGrade implements SortingStrategy {
    @Override
    public void sort(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.getMedie_note(), s1.getMedie_note()));
    }
}