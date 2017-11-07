package school;

import org.junit.Assert;
import org.junit.Test;

public class TestRuler {
    Ruler ruler = new Ruler(15);
    @Test
    public void checkMeasurementIsBiggerThenLength(){
        Assert.assertFalse(ruler.setMeasurement(20));
    }

    @Test
    public void checkMeasure(){
         Assert.assertTrue(ruler.measure() == 0.0);
    }
}
