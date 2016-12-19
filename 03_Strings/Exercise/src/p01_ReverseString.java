import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        StringBuilder output = new StringBuilder();

        for (int i = input.length-1; i >= 0 ; i--) {
            output.append(input[i]);
        }
        System.out.println(output);
    }
}
