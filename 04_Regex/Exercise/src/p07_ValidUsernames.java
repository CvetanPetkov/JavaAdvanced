import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p07_ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String regex = "[\\s\\/\\\\\\(\\)]*\\b([a-zA-Z][\\w0-9_]{2,24})";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(input);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        while (match.find()) {
            list.add(match.group(1));
        }

        int bestSum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int firstUser = list.get(i).length();
            int secondUser = list.get(i+1).length();
            int currSum = firstUser + secondUser;
            if (currSum > bestSum) {
                bestSum = currSum;
                output.clear();
                output.add(list.get(i));
                output.add(list.get(i+1));
            }
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
