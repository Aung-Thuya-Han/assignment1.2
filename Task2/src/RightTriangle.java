public class RightTriangle {

    public double calculateHypotenuse(double firstLeg, double secondLeg) {
        // c = square root of (a² + b²)

        double hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
        return hypotenuse;
    }
}
