import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
}