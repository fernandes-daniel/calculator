package calculator;

import calculator.operations.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputParser {

    private final OperationFactory operationFactory;
    private List instructionsFromInput;

    public InputParser( File instructionsFile, OperationFactory operationFactory ) throws IOException {
        this.operationFactory = operationFactory;
        instructionsFromInput = FileUtils.readLines( instructionsFile );
    }

    public Float getStartingValue() {
        String startValue = ( String ) instructionsFromInput.get( instructionsFromInput.size() - 1 );
        return Float.parseFloat( startValue.split( " " )[ 1 ] );
    }

    public List<Instruction> getInstructions() {
        List instructionsFromInputWithoutLastLine = new ArrayList<Object>( instructionsFromInput );
        instructionsFromInputWithoutLastLine.remove( instructionsFromInputWithoutLastLine.size() - 1 );

        List<Instruction> instructionList = new ArrayList<Instruction>();
        for ( Object instruction : instructionsFromInputWithoutLastLine ) {
            String[] instructionSplit = ( ( String ) instruction ).split( " " );

            Operation operation = operationFactory.newOperation( instructionSplit[ 0 ] );
            Float value = Float.parseFloat( instructionSplit[ 1 ] );

            if ( operation != null && value != null ) {
                instructionList.add( new Instruction( operation, value ) );
            }
        }

        return instructionList;
    }

}
