import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validInput = false;
        while (!validInput) {
            try {
                Scanner input = new Scanner(System.in);
                int x = input.nextInt();
                int y = input.nextInt();
                validInput = true;
                int sum = x + y;
                System.out.println(sum);
            } catch (InputMismatchException e) {
                System.out.println("Please Enter only integer numbers!");
            }
        }
    }
}