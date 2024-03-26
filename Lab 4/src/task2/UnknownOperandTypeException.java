package task2;

public class UnknownOperandTypeException extends CalculatorException {
    public UnknownOperandTypeException(String operation) {
        super("Tip de date necunoscut in operatia: " + operation);
    }
}