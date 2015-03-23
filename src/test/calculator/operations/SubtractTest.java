package calculator.operations;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubtractTest {
    private Subtract subtract;

    @Before
    public void setUp() throws Exception {
        subtract = new Subtract();
    }

    @Test
    public void testExecute() throws Exception {
        assertEquals( ( float ) 1, subtract.execute( ( float ) 4, ( float ) 3 ) );
    }
}
