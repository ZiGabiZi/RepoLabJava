package task2;

public class DoubleCalculatorResult extends CalculatorResult {
    private final Double result;

    public DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        this.result = computeResult();
    }

    @Override
    public Double computeResult() {
        // Calculul rezultatului
        double left = (double) super.getRequest().getLeftOperand();
        double right = (double) super.getRequest().getRightOperand();
        switch (super.getRequest().getOperation()) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                throw new IllegalArgumentException("Invalid operation: " + super.getRequest().getOperation());
        }
    }

    @Override
    public Double getResult() {
        return result;
    }
}


