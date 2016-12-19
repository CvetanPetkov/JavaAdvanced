import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04_ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("end")) {
            sb.append(input);
            input = read.readLine();
        }

        String output = sb.toString().replaceAll("<a", "[URL");
        output = output.replaceAll("</a>", "[/URL]");

        System.out.println(output);
    }
}
