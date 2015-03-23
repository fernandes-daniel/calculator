package calculator.operations;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivideTest {
    private Divide divide;

    @Before
    public void setUp() throws Exception {
        divide = new Divide();
    }

    @Test
    public void testExecute() throws Exception {
        assertEquals( ( float ) 2, divide.execute( ( float ) 4, ( float ) 2 ) );
    }
}
