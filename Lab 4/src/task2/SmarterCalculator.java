package task2;

import java.util.ArrayList;
import java.util.List;

public final class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args){
        List<CalculatorResult> results = new ArrayList<>();
        List<CalculatorRequest> requests = new ArrayList<>();
        try {
            requests = InputConverter.mapRequest(args);
        } catch (UnknownOperandTypeException e){
            System.err.println("Exception: " + e.getMessage());
        }

        for (CalculatorRequest req : requests){
            String reqType = req.getRequestType();

            switch (reqType){
                case "Integer":
                    results.add(new IntegerCalculatorResult(req));
                    break;
                case "Double":
                    results.add(new DoubleCalculatorResult(req));
                    break;
                case "Boolean":
                    results.add(new BooleanCalculatorResult(req));
                    break;
                default:
                    System.out.println("Eroare : Nu sa gasit tipul de date");
                    break;
            }
        }

        return results;
    }
}