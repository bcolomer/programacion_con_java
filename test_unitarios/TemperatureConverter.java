/*
 * Crea una clase TemperatureConverter que convierta temperaturas de Celsius a Fahrenheit y viceversa.
 *  Escribe pruebas unitarias para asegurarte de que la conversión se realiza correctamente. 
 * (112 °F − 32) × 5 / 9 = 44,444 °C
 * @autor Barbara Colomer
 */
public class TemperatureConverter {

    public void main(String[] args) {
        double temperatureCelsius = 0;
        double temperatureFarenheit = 0;
        celsiusToFahrenheit(temperatureCelsius);
        fahrenheitToCelsius(temperatureFarenheit);
    }

    // Método para convertir de Celsius a Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Pruebas unitarias utilizando Given-When-Then
}
