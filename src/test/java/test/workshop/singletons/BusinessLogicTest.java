package test.workshop.singletons;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BusinessLogicTest {

    private BusinessLogic businessLogic;

    @BeforeMethod
    public void setUp() {
        businessLogic = new BusinessLogic();
    }

    @Test
    public void carGo_When_TrafficLightGreen() {
        TrafficLight.INSTANCE.setColor("green");
        Car car = mock(Car.class);
        businessLogic.doStuff(car);
        verify(car).go();
    }

    @Test
    public void carStop_When_TrafficLightRed() {
        Car car = mock(Car.class);
        businessLogic.doStuff(car);
        verify(car).stop();
    }
}