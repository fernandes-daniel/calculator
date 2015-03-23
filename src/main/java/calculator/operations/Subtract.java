package calculator.operations;

public class Subtract implements Operation {
    @Override
    public Float execute( Float inputValue, Float modifierValue ) {
        return inputValue - modifierValue;
    }

    @Override
    public String toString() {
        return "Subtract";
    }
}
