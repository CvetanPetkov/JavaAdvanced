import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class p02_KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        Consumer<String> print = name -> System.out.print(name);

        for (String s : input) {
            print.accept("Sir ");
            print.accept(s);
            System.out.println();
        }
    }
}
