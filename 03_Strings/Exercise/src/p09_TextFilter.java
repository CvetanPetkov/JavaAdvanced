import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p09_TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String[] ban = read.readLine().split(", ");
        String input = read.readLine();
        String banZero = "";
        String banOne = "";

        for (char c : ban[0].toCharArray()) {
            banZero += "*";
        }for (char c : ban[1].toCharArray()) {
            banOne += "*";
        }

        String newInput = input.replace(ban[0], banZero).replace(ban[1], banOne);

        System.out.println(newInput);
    }
}
