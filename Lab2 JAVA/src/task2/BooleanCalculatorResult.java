package task2;

public class BooleanCalculatorResult extends CalculatorResult {
    private final Boolean result;

    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        this.result = computeResult();
    }

    @Override
    public Boolean computeResult() {
        // Calculul rezultatului
        boolean left = (boolean) super.getRequest().getLeftOperand();
        boolean right = (boolean) super.getRequest().getRightOperand();
        switch (super.getRequest().getOperation()) {
            case "&":
                return left && right;
            case "|":
                return left || right;
            default:
                throw new IllegalArgumentException("Invalid operation: " + super.getRequest().getOperation());
        }
    }

    @Override
    public Boolean getResult() {
        return result;
    }
}


