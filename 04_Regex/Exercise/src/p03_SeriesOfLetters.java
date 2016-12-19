import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        String regex = "([a-z])\\1*";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(input);
        StringBuffer output = new StringBuffer();

        while (match.find()) {
            String letter = match.group(1);
            if (!output.toString().endsWith(letter)) {
                output.append(letter);
            }
        }

        System.out.println(output);
    }
}
