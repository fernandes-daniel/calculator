package calculator;

import calculator.operations.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    private InputParser inputParser;
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        inputParser = mock( InputParser.class );
        calculator = new Calculator( inputParser );
    }

    @Test
    public void testRun() throws Exception {
        List<Instruction> instructions = new ArrayList<Instruction>();

        Operation operation1 = mock( Operation.class );
        when( operation1.execute( ( float ) 2, ( float ) 3 ) )
                .thenReturn( ( float ) 5 );
        Operation operation2 = mock( Operation.class );
        when( operation2.execute( ( float ) 5, ( float ) 4 ) )
                .thenReturn( ( float ) 9 );

        instructions.add( new Instruction( operation1, ( float ) 3 ) );
        instructions.add( new Instruction( operation2, ( float ) 4 ) );

        when( inputParser.getStartingValue() ).thenReturn( ( float ) 2 );
        when( inputParser.getInstructions() ).thenReturn( instructions );

        Float finalResult = calculator.run();

        verify( inputParser ).getStartingValue();
        verify( inputParser ).getInstructions();
        verifyNoMoreInteractions( inputParser );

        verify( operation1 ).execute( ( float ) 2, ( float ) 3 );
        verifyNoMoreInteractions( operation1 );
        verify( operation2 ).execute( ( float ) 5, ( float ) 4 );
        verifyNoMoreInteractions( operation2 );

        assertEquals( ( float ) 9, finalResult );
    }
}
