public class ObsoleteMeasures {

    public void convert(double grams) {

        double GRAMS_IN_LUOTI = 13.28;
        int LUOTI_IN_NAULA = 32;
        int NAULA_IN_LEIVISKA = 20;

        double totalLuoti = grams / GRAMS_IN_LUOTI;

        int leiviska = (int) (totalLuoti / (LUOTI_IN_NAULA * NAULA_IN_LEIVISKA));

        double remainingLuoti = totalLuoti % (LUOTI_IN_NAULA * NAULA_IN_LEIVISKA);

        int naula = (int) (remainingLuoti / LUOTI_IN_NAULA);

        double luoti = remainingLuoti % LUOTI_IN_NAULA;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);
    }
}
