import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class p06_ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : input) {
            nums.add(Integer.parseInt(s));
        }
        int divisor = Integer.parseInt(reader.readLine());

        Function<ArrayList<Integer>, ArrayList<Integer>> divise = integer -> {
            ArrayList<Integer> output = new ArrayList<>();
            for (Integer num : nums) {
                if (num % divisor != 0) {
                    output.add(num);
                }
            }
            Collections.reverse(output);
            return output;
        };

        ArrayList<Integer> output = divise.apply(nums);
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }
    }
}
