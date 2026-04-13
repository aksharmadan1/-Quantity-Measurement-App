public class QuantityMeasurementApp {
    private final double value;

    public QuantityMeasurementApp(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        // Step 1: Check if it's the same memory reference
        if (this == o) return true;

        // Step 2: Check for Null or different Class type
        if (o == null || getClass() != o.getClass()) return false;

        // Step 3: Compare the numeric values
        QuantityMeasurementApp that = (QuantityMeasurementApp) o;
        return Double.compare(that.value, value) == 0;
    }
}
