import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Function;

public class p05_AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        Integer[] nums = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Function<Integer, Integer> add = number -> number + 1;
        Function<Integer, Integer> substract = number -> number - 1;
        Function<Integer, Integer> multiply = number -> number * 2;
        Consumer<Integer> print = number -> System.out.print(number + " ");

        String command = reader.readLine();
        while (!command.equals("end")) {
            if (command.equals("add")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = add.apply(nums[i]);
                }
            } else if (command.equals("subtract")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = substract.apply(nums[i]);
                }
            } else if (command.equals("multiply")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = multiply.apply(nums[i]);
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    print.accept(nums[i]);
                }
            }
            command = reader.readLine();
        }
    }
}
