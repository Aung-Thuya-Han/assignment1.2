import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RightTriangle triangle = new RightTriangle();

        System.out.print("Length of the first leg: ");
        double firstLeg = Double.parseDouble(scanner.nextLine());

        System.out.print("Length of the second leg: ");
        double secondLeg = Double.parseDouble(scanner.nextLine());

        double hypotenuse = triangle.calculateHypotenuse(firstLeg, secondLeg);

        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}
