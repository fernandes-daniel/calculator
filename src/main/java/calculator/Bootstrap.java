package calculator;

import java.io.File;

public class Bootstrap {

    public static void main( String[] args ) throws Exception {

        if ( args.length == 0 ) {
            throw new Exception( "First argument should be the instructions file name" );
        }
        InputParser inputParser = new InputParser(
                new File( args[ 0 ] ),
                new OperationFactory()
        );

        Calculator calculator = new Calculator( inputParser );

        Float calculationResult = calculator.run();
        System.out.println( calculationResult );
    }
}
