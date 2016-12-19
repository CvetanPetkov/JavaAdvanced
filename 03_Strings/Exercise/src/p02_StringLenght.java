import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_StringLenght {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        StringBuilder sb = new StringBuilder();

        boolean isSmall = false;
        for (int i = 0; i < 20; i++) {
            if (input.length() < 20 && !isSmall) {
                sb.append(input.substring(0, input.length()));
                i += input.length()-1;
                isSmall = true;
            } else if (isSmall){
                sb.append("*");
            } else {
                sb.append(input.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
