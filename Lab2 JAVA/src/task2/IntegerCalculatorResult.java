package task2;

public class IntegerCalculatorResult extends CalculatorResult {
    private final Integer result;

    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        this.result = computeResult();
    }

    @Override
    public Integer computeResult() {
        // Calculul rezultatului
        int left = (int) super.getRequest().getLeftOperand();
        int right = (int) super.getRequest().getRightOperand();
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
    public Integer getResult() {
        return result;
    }
}

