import java.util.Objects;

public class QuantityMeasurementApp {

    // Define Units with their conversion factors to a base unit (Inches)
    public enum Unit {
        FEET(12.0), INCHES(1.0);

        public final double conversionFactor;

        Unit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }
    }

    private final double value;
    private final Unit unit;

    public QuantityMeasurementApp(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementApp that = (QuantityMeasurementApp) o;

        // Convert both to base unit (Inches) and compare
        double value1 = this.value * this.unit.conversionFactor;
        double value2 = that.value * that.unit.conversionFactor;

        return Double.compare(value1, value2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
