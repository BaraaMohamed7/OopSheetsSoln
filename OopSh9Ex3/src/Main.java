import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validInput = false;
        while (!validInput) {
            Scanner inp = new Scanner(System.in);
            try {
                System.out.println("please enter dimentions of recatangle");
                Rectangle rect = new Rectangle(inp.nextInt(), inp.nextInt());
                validInput = true;

                System.out.println(rect.getArea());
                System.out.println(rect.getPerimeter());

            } catch (InvalidRectangleException e) {
                System.out.println("Invalid width or height");
            }
        }
    }
}