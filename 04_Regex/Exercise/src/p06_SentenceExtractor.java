import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06_SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String searchFor = reader.readLine();
        String input = reader.readLine();
        Pattern pat = Pattern.compile("([^.!?]+\\b" + searchFor + "\\b[^.!?]+[.!?])");
        Matcher match = pat.matcher(input);

        while (match.find()) {
            System.out.println(match.group());
        }

    }
}
