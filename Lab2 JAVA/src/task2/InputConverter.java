package task2;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {
    public static List<CalculatorRequest> mapRequests(String[] args) {
        List<CalculatorRequest> requests = new ArrayList<>();
        for (int i = 0; i < args.length; i += 3) {
            Object leftOperand = parseOperand(args[i]);
            String operation = args[i + 1];
            Object rightOperand = parseOperand(args[i + 2]);
            requests.add(new CalculatorRequest(leftOperand, rightOperand, operation));
        }
        return requests;
    }

    private static Object parseOperand(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            try {
                return Double.parseDouble(arg);
            } catch (NumberFormatException ex) {
                return Boolean.parseBoolean(arg);
            }
        }
    }
}

