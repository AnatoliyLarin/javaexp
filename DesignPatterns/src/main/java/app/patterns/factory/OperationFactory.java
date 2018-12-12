package app.patterns.factory;

import app.patterns.strategy.*;
import app.patterns.strategy.Operations;

public class OperationFactory {

    public Operations createOperation(String operationType){
        if(operationType == null) {
            return null;
        }
        if(operationType.equalsIgnoreCase("Add")){
            return new Add();
        } else if(operationType.equalsIgnoreCase("Multiply")){
            return new Multiply();
        } else if(operationType.equalsIgnoreCase("Extent")){
            return new Extent();
        }
        return null;
    }
}
