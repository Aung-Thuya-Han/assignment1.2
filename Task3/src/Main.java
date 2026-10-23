import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObsoleteMeasures converter = new ObsoleteMeasures();

        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());

        converter.convert(grams);
    }
}
