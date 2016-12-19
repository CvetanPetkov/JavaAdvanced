import java.util.Scanner;
import java.util.TreeMap;

public class p04_CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            int count = 1;
            if (map.containsKey(input[i])) {
                count += map.get(input[i]);
                map.put(input[i], count);
            } else {
                map.put(input[i], count);
            }
        }

        for (Character ch : map.keySet()) {
            System.out.println(ch + ":" + " " + map.get(ch) + " " + "time/s");
        }
    }
}
