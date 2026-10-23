public class FahrenheitToCelsius {

    public double convert(double fahrenheit) {

        double celsius = ((fahrenheit - 32) * 5) / 9;
        return celsius;

    }
}
