import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p04_ConvertFromBase10ToBaseN {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String[] input = read.readLine().split(" ");
        int base = Integer.parseInt(input[0]);
        char[] number = input[1].toCharArray();



//        System.out.println(Integer.toString(number, base));
    }
}
