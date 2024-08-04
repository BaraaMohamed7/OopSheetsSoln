public class MathHelper {
     private final double PI = Math.PI;
     private static int counter = 0;

     public static double abs(double x) {
         return x >= 0 ? x : -x;
     }

     public static int pow(int x, int y) {
         int result = 1;
         for (int i = 0; i < y; i++) {
             result *= x;
         }
         counter++;
         return result;
     }
}
