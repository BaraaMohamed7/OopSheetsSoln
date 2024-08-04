public class Constants {
    public static final double SPEED_OF_LIGHT = 3e8;
    public static final double GRAVITATIONAL_CONSTANT = 6.6743e-11;
    public static int numCalculations = 0;

    public static double calculateEnergy(double mass) {
        numCalculations++;
        return mass * Math.pow(SPEED_OF_LIGHT, 2);
    }

    public static double calculateForce(double m1,double m2,double d) {
        numCalculations++;
        return (GRAVITATIONAL_CONSTANT  * m1 * m2) / Math.pow(d,2);
    }
}
