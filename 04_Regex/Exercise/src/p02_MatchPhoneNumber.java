import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        String regex = "\\+359(?<del> |-)\\d{1}(\\k<del>)\\d{3}(\\k<del>)\\d{4}\\b";
        Pattern pat = Pattern.compile(regex);
        Matcher match;

        while (!input.equals("end")) {
            match = pat.matcher(input);
            if (match.find()) {
                System.out.println(match.group());
            }
            input = read.readLine();
        }
    }
}
