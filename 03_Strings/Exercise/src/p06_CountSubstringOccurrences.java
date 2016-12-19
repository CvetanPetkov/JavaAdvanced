import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06_CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine().toLowerCase();
        String searchFor = read.readLine().toLowerCase();
        Pattern pat = Pattern.compile(searchFor);
        Matcher match = pat.matcher(input);

        int count = 0;
        while (match.find()) {
            count++;
        }

        System.out.println(count);
    }
}
