import app.Car;
import training.patterns.abstractfactory.Context;
import training.patterns.builder.CarBuilder;

public class TestCarBuilder {

    public static void main(String[] args){

        CarBuilder carBuilder = new CarBuilder();
        Context factory = new Context();

        Car car = carBuilder.withBreakType(factory.getFactory("Tesla").createBreak(("Soft")))
                .bodyColor("Green")
                .hasAirCondition(true)
                .withGearType(factory.getFactory("Tesla").createGear(("Winter")))
                .withWheelType(factory.getFactory("Tesla").createWheel(("Metal")))
                .bodyHeight(175)
                .bodyWidth(350)
                .withMaxSpeed(175)
                .numberOfSeats(7)
                .build();

        System.out.println("\nOrdered car's info\n");
        System.out.println("Gear type: " + car.getGearType().run() + "\n" + "Wheel type: " + car.getWheelType().run());
        System.out.println("Break beak: " + car.getBreakType().stop() + "\n" + "Color: " + car.getColor());
        System.out.println("Seats number: " + car.getNumberOfSeats() + "\n" + "Conditioning: " + car.getNumberOfSeats());
        System.out.println("Max speed: " + car.getMaxSpeed() + "\n" + "Body's width/height: " + car.getWidth() + "/" + car.getHeight());
    }
}