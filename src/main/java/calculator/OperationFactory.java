package calculator;

import calculator.operations.*;

public class OperationFactory {

    public Operation newOperation( String operationName ) {
        Class<?> genericClass = null;

        try {
            String safeOperationName = operationName.substring( 0, 1 ).toUpperCase() + operationName.substring( 1 );
            genericClass = Class.forName( "calculator.operations." + safeOperationName );
            return ( Operation ) genericClass.newInstance();
        } catch ( ClassNotFoundException e ) {
            //Ignore calculator.operations that are not defined yet
        } catch ( IllegalAccessException e ) {
            //..,
        } catch ( InstantiationException e ) {
            //...
        }

        return null;
    }
}
