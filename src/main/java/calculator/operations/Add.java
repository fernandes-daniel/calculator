package calculator.operations;

public class Add implements Operation {

    @Override
    public Float execute( Float inputValue, Float modifierValue ) {
        return inputValue + modifierValue;
    }


    @Override
    public String toString() {
        return "Add";
    }
}
