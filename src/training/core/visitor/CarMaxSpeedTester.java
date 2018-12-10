package training.core.visitor;

import app.Car;

public class CarMaxSpeedTester implements Visitor {

    @Override
    public void visit(Car carForTest) {
        if(carForTest.getMaxSpeed() > 200)
            System.out.println("Looks like it's a sport car.");
        else
            System.out.println("Looks like it's a regular car.");
    }
}