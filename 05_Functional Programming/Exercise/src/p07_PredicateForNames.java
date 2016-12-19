import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class p07_PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");

        Predicate<String> test = name -> name.length() <= n;

        for (String s : input) {
            if (test.test(s)) {
                System.out.println(s);
            }
        }
    }
}
