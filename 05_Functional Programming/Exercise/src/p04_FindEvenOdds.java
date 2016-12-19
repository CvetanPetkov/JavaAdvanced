import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;

public class p04_FindEvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        Integer[] nums = new Integer[end - start + 1];

        int iterator = 0;
        for (int i = start; i <= end; i++) {
            nums[iterator] = i;
            iterator++;
        }

        String command = reader.readLine();

        Function<Integer[], ArrayList<Integer>> funct = integers -> {

            ArrayList<Integer> sequence = new ArrayList<>();

            if (command.equals("odd")) {
                for (Integer num : nums) {
                    if (num % 2 != 0) {
                        sequence.add(num);
                    }
                }
            } else {
                for (Integer num : nums) {
                    if (num % 2 == 0) {
                        sequence.add(num);
                    }
                }
            }
            return sequence;
        };

        ArrayList<Integer> output = funct.apply(nums);
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }
    }
}
