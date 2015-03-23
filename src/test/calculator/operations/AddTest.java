package calculator.operations;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddTest {
    private Add add;

    @Before
    public void setUp() throws Exception {
        add = new Add();
    }

    @Test
    public void testExecute() throws Exception {
        assertEquals( ( float ) 7, add.execute( ( float ) 4, ( float ) 3 ) );
    }
}
