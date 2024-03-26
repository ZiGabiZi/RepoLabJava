import task2.CalculatorRequest;
import task2.CalculatorResult;
import task2.InvalidOperationException;
import task3.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static task2.SmarterCalculator.calculate;

public class Main {
    public static void main(String[] args) {
        String[] inputs = {"1", "+", "2", "2", "*", "5", "1", "+", "0.5", "1.0", "-", "2.0", "10.0", "/", "0", "true", "&&", "false"};
        String[] inputs2 = {"true", "&&", "true"};
        String[] inputs3 = {"3", "*", "(", "2", "+", "4", ")", "-", "5"};

        // Calcularea rezultatelor
        List<CalculatorResult> results = calculate(inputs);

        for (CalculatorResult res: results){
            CalculatorRequest req = res.getRequest();
            Object leftOperand = req.getLeftOperand();
            Object rightOperand = req.getRightOperand();
            String operation = req.getRequestType();
            Object rasp = new Object();
            try {
                rasp = res.computeResult();
                System.out.println("Operația " + req + " are rezultatul " + rasp);
            } catch (InvalidOperationException e) {
                System.err.println("Excepție: " + e.getMessage());
            }
        }

        Map<String, Double> infoCurs = new HashMap<>();
        infoCurs.put("Mate", 6.7);
        infoCurs.put("Info", 9.9);

        Student student1 = new Student("Milan", infoCurs);
        System.out.println("Student original: " + student1);

        Student student1Cloned = new Student();
        try {
            student1Cloned = (Student) student1.clone();
        } catch (CloneNotSupportedException e){
            System.err.println("Excepție: " + e.getMessage());
        }

        System.out.println("Student clonat: " + student1Cloned);

        student1Cloned.updateCourseInformation("Mate", 8.0);
        System.out.println("Student original după modificare: " + student1);
        System.out.println("Student clonat după modificare: " + student1Cloned);
    }
}
