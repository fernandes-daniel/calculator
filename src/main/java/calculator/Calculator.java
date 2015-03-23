package calculator;

import java.util.List;
import calculator.operations.*;

public class Calculator {

    private InputParser inputParser;


    public Calculator( InputParser inputParser ) {
        this.inputParser = inputParser;
    }

    public Float run() {
        List<Instruction> instructions = inputParser.getInstructions();

        Float result = inputParser.getStartingValue();

        for ( Instruction instruction : instructions ) {
            Operation operation = instruction.getOperation();
            Float computeValue = instruction.getComputeValue();

            result = operation.execute( result, computeValue );
        }

        return result;
    }
}
