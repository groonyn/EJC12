package integTest;

import org.junit.Test;
import org.junit.Assert;

public class TrafficLightTest {

    @Test
    public void testIsPositiveNumber(){
        double source = -1;
        double expected = "1";
        double actual = DoubleUtils.fromDouble(source);
        assertEquals("Unexpected string value", expected, actual);
    }
    @Test
    public void testIsNotBoolean(){

    }
    @Test
    public void testIsNotChar(){

    }

}
