import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;

public class p08_FindSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" +");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }

        Function<ArrayList<Integer>, Integer> findSmallest = number -> {
          int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= smallest) {
                    smallest = list.get(i);
                    index = i;
                }
            }
            return index;
        };

        System.out.println(findSmallest.apply(list));
    }
}
