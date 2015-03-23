package calculator.operations;

public class Multiply implements Operation {
    @Override
    public Float execute( Float inputValue, Float modifierValue ) {
        return inputValue * modifierValue;
    }

    @Override
    public String toString() {
        return "Multiply";
    }
}
