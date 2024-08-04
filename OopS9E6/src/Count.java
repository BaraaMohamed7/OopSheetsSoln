import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            Scanner input = new Scanner(file);
            Scanner input2 = new Scanner(file);

            int lines= 0;
            int words= 0;
            int chars= 0;
            while(input.hasNext()) {
                String st = input.next();
                words++;
                chars += st.length();
            }
            input.close();
            while(input2.hasNext()) {
                input2.nextLine();
                lines++;
            }

            System.out.println("lines : " + lines);
            System.out.println("words : " + words);
            System.out.println("chars : " + chars);

            input.close();
            input2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
