package integTest;

import com.epam.hw2.TrafficLight;
import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTests {

    @Test(expected = NullPointerException.class)
    public void testChooseLightNegative() {
        Assert.assertEquals("Not a positive integer number", TrafficLight.chooseLight("-100"));
        Assert.assertEquals("Not a positive integer number", TrafficLight.chooseLight("-1"));
    }

    @Test
    public void testChooseLightPositive() {

        Assert.assertEquals("Red Light!", TrafficLight.chooseLight("1"));
        Assert.assertEquals("Red Light!", TrafficLight.chooseLight("2"));
        Assert.assertEquals("Yellow Light!", TrafficLight.chooseLight("3"));
        Assert.assertEquals("Yellow Light!", TrafficLight.chooseLight("4"));
        Assert.assertEquals("Yellow Light!", TrafficLight.chooseLight("5"));
        Assert.assertEquals("Green Light!", TrafficLight.chooseLight("6"));
        Assert.assertEquals("Green Light!", TrafficLight.chooseLight("50"));
        Assert.assertEquals("Green Light!", TrafficLight.chooseLight("590"));

    }
}













