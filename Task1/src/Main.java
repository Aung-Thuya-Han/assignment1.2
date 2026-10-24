import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FahrenheitToCelsius converter = new FahrenheitToCelsius();

        System.out.print("Temperature in Fahrenheit: ");
        double fahren = Double.parseDouble(scanner.nextLine());

        double celsi = converter.convert(fahren);

        System.out.printf("Temperature in Celsius: %.1f", celsi);
    }
}
