import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveText {
    public static void main(String[] args) {
        ArrayList<String>  words = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            words = reader.lines().collect(Collectors.toCollection(ArrayList::new));
            for(String word : words) {
                if (Objects.equals(word, args[0])) {
                    words.remove(word);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Enter valid file");
        }

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
            for (String word : words) {
                writer.write(word + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}