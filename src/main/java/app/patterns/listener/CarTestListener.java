package app.patterns.listener;

import app.core.carPlant.Car;

public class CarTestListener implements CarListener{

    @Override
    public Car onRelease(Car car){
        return null ;
    }
}