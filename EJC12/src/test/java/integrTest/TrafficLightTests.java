package integrTest;

import com.epam.hw2.TrafficLight;
import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTests {
    TrafficLight trafficLight = new TrafficLight();
    @Test
   void testTrafficLightGreenColour() {
        Assert.assertEquals ("Green Light!", trafficLight.chooseLight(6));
        Assert.assertEquals ("Green Light!", trafficLight.chooseLight(60));
    }

    @Test
   void testTrafficLightYellowColour() {
        Assert.assertEquals ("Yellow Light!", trafficLight.chooseLight(3));
        Assert.assertEquals ("Yellow Light!", trafficLight.chooseLight(5));
    }

    @Test
   void testTrafficLightRedColour() {
        Assert.assertEquals ("Red Light!", trafficLight.chooseLight(0));
        Assert.assertEquals ("Red Light!", trafficLight.chooseLight(2));
    }

}
