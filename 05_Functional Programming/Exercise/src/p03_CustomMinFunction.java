import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class p03_CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Function<Integer[], Integer> funct = integers -> {
            int minInteger = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (integers[i] < minInteger) {
                    minInteger = integers[i];
                }
            }
            return minInteger;
        };

        int output = funct.apply(nums);
        System.out.println(output);
    }
}
