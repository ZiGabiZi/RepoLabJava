package task2;

import java.util.ArrayList;
import java.util.List;

public class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args) {
        List<CalculatorResult> results = new ArrayList<>();
        List<CalculatorRequest> requests = InputConverter.mapRequests(args);
        for (CalculatorRequest request : requests) {
            CalculatorResult result;
            switch (request.getRequestType()) {
                case "Boolean":
                    result = new BooleanCalculatorResult(request);
                    break;
                case "Integer":
                    result = new IntegerCalculatorResult(request);
                    break;
                case "Double":
                    result = new DoubleCalculatorResult(request);
                    break;
                default:
                    throw new IllegalArgumentException("Tip de cerere invalid");
            }
            results.add(result);
        }
        return results;
    }
}

