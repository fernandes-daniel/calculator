package calculator;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class CalculatorIntegrationTest {

    @Test
    public void testCalculator_MultipleInstructions() throws IOException {
        InputParser inputParser = new InputParser(
                new File( "./src/test/resources/testMultipleInstructionsFile" ),
                new OperationFactory()
        );

        Calculator calculator = new Calculator( inputParser );

        Float calculationResult = calculator.run();

        assertEquals( ( float ) 15, calculationResult );
    }


    @Test
    public void testCalculator_OneInstructions() throws IOException{
        InputParser inputParser = new InputParser(
                new File( "./src/test/resources/testOneInstructionFile" ),
                new OperationFactory()
        );

        Calculator calculator = new Calculator( inputParser );

        Float calculationResult = calculator.run();

        assertEquals( ( float ) 45, calculationResult );
    }

    @Test
    public void testCalculator_NoInstructions() throws IOException{
        InputParser inputParser = new InputParser(
                new File( "./src/test/resources/testNoInstructionFile" ),
                new OperationFactory()
        );

        Calculator calculator = new Calculator( inputParser );

        Float calculationResult = calculator.run();

        assertEquals( ( float ) 1, calculationResult );
    }
}
