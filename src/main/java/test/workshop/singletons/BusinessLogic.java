package test.workshop.singletons;

public class BusinessLogic {

    public void doStuff(Car car) {
        if (TrafficLight.INSTANCE.getColor().equals("red")) {
            car.stop();
        } else {
            car.go();
        }
    }
}
