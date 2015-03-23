package calculator.operations;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplyTest {
    private Multiply multiply;

    @Before
    public void setUp() throws Exception {
        multiply = new Multiply();
    }

    @Test
    public void testExecute() throws Exception {
        assertEquals( ( float ) 15, multiply.execute( ( float ) 3, ( float ) 5 ) );
    }
}
