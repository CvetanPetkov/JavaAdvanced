import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01_MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        String regex = "\\b([A-Z][a-z]+ [A-Z][a-z]+)\\b";
        Pattern pat = Pattern.compile(regex);


        while (!input.equals("end")) {
            Matcher match = pat.matcher(input);
            if (match.find()) {
                System.out.println(match.group(0));
            }
            input = read.readLine();
        }
    }
}
