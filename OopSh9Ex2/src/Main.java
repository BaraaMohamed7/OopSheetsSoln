import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            Random random = new Random();
            nums[i] = random.nextInt();
        }

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter index to access: ");
            int index = input.nextInt();
            System.out.println(nums[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}