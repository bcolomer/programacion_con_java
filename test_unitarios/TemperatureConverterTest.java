
import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {
    @Test

    public void celsiusToFahrenheitTest1() {
        // Given
        double celsius = 25.0;
        double expectedFahrenheit = 77;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double toleratedDelta = 0;

        // When
        double actualGiven = temperatureConverter.celsiusToFahrenheit(celsius);

        // Then
        Assert.assertEquals(expectedFahrenheit, actualGiven, toleratedDelta);

    }

    @Test
    public void celsiusToFahrenheitTest2() {
        // Given
        double celsius = 25.0;
        double expectedFahrenheit = 80;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double toleratedDelta = 0;

        // When
        double actualGiven = temperatureConverter.celsiusToFahrenheit(celsius);

        // Then
        Assert.assertEquals(expectedFahrenheit, actualGiven, toleratedDelta);

    }

    @Test
    public void fahrenheitToCelsiusTest1() {
        // Given
        double fahrenheit = 68.0;
        double expectedCelsius = 20;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double toleratedDelta = 0;

        // When
        double actualGiven = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Then
        Assert.assertEquals(expectedCelsius, actualGiven, toleratedDelta);

    }

    @Test
    public void fahrenheitToCelsiusTest2() {
        // Given
        double fahrenheit = 68.0;
        double expectedCelsius = 120;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double toleratedDelta = 0;

        // When
        double actualGiven = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Then
        Assert.assertEquals(expectedCelsius, actualGiven, toleratedDelta);

    }
}
