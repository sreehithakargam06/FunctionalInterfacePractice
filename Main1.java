import java.util.function.Function;

public class Main1 {

    public static void main(String[] args) {

        // Create SensorData object
        SensorData data = new SensorData(30.5, 60.0);

        // Threshold value
        double threshold = 25.0;

        // Function to extract temperature
        Function<SensorData, Double> getTemperature =
            new Function<SensorData, Double>() {

                @Override
                public Double apply(SensorData data) {
                    return data.getTemperature();
                }
            };

        // Extract temperature
        double temperature = getTemperature.apply(data);

        System.out.println("Temperature = " + temperature);

        // Function to check temperature against threshold
        Function<Double, Boolean> checkTemperature =
            new Function<Double, Boolean>() {

                @Override
                public Boolean apply(Double temp) {
                    return temp > threshold;
                }
            };

        // Check the temperature
        boolean result = checkTemperature.apply(temperature);

        System.out.println("Is Temperature Above Threshold? " + result);
    }
}