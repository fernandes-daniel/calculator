package calculator;


import calculator.operations.Add;
import calculator.operations.Multiply;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class InputParserTest {
    private InputParser inputParser;

    @org.junit.Before
    public void setUp() throws Exception {
        inputParser = new InputParser(
                new File( "./src/test/resources/testInstructionsFile1" ),
                new OperationFactory()
        );
    }

    @org.junit.Test
    public void testGetStartingValue() throws Exception {
        assertEquals( ( float ) 5, inputParser.getStartingValue() );
    }

    @org.junit.Test
    public void testGetInstructions() throws Exception {
        List<Instruction> expectedInstructions = new ArrayList<Instruction>();
        expectedInstructions.add( new Instruction( new Add(), ( float ) 2 ) );
        expectedInstructions.add( new Instruction( new Multiply(), ( float ) 3 ) );

        assertEquals( expectedInstructions, inputParser.getInstructions() );
    }
}
