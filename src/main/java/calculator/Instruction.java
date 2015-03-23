package calculator;

import calculator.operations.*;

public class Instruction {
    private Operation operation;
    private Float computeValue;

    public Instruction( Operation operation, Float computeValue ) {
        this.operation = operation;
        this.computeValue = computeValue;
    }

    public Operation getOperation() {
        return operation;
    }

    public Float getComputeValue() {
        return computeValue;
    }

    @Override
    public String toString() {
        return "calculator.Instruction{" +
                "\noperation=" + operation +
                "\n, computeValue=" + computeValue +
                '}';
    }

    @Override
    public boolean equals( Object o ) {
        return this.toString().equals( o.toString() );
    }

}
