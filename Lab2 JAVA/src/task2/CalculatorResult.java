package task2;

public abstract class CalculatorResult {
    private final CalculatorRequest calculatorRequest;

    protected CalculatorResult(CalculatorRequest calculatorRequest) {
        this.calculatorRequest = calculatorRequest;
    }

    public CalculatorRequest getRequest() {
        return calculatorRequest;
    }

    public abstract Object computeResult();

    public abstract Object getResult();


}


