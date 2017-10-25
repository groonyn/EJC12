package integrTest;

import com.epam.hw2.TrafficLight;
import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTests {
    TrafficLight trafficLight = new TrafficLight();
    private String light;

    @Test
    public void testTrafficLightGreenColour() {
        light = trafficLight.chooseLight(6);
        Assert.assertTrue(light == "Green Light!");
        light = trafficLight.chooseLight(60);
        Assert.assertTrue(light == "Green Light!");
    }

    @Test
    public void testTrafficLightYellowColour() {
        light = trafficLight.chooseLight(3);
        Assert.assertTrue(light == "Yellow Light!");
        light = trafficLight.chooseLight(5);
        Assert.assertTrue(light == "Yellow Light!");
    }

    @Test
    public void testTrafficLightRedColour() {
        light = trafficLight.chooseLight(0);
        Assert.assertTrue(light == "Red Light!");
        light = trafficLight.chooseLight(2);
        Assert.assertTrue(light == "Red Light!");

    }

}
