import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05_ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String regex = "\\s([a-zA-Z0-9][.-_a-zA-Z0-9]*[a-zA-Z0-9])@([a-zA-Z-]+[.][a-zA-Z]+[.]*[a-zA-Z]*\\b)";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(input);

        while (match.find()) {
            String user = match.group(1);
            String host = match.group(2);
            System.out.println(user + "@" + host);
        }
    }
}