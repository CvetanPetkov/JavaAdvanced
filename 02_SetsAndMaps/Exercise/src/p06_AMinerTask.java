import java.util.LinkedHashMap;
import java.util.Scanner;

public class p06_AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int count = 1;
        String resource = new String();
        int quantity = 0;

        while (!input.equals("stop")) {
            if (count % 2 != 0) {
                resource = input;
            } else {
                if (map.containsKey(resource)) {
                    quantity = map.get(resource) + Integer.parseInt(input);
                    map.put(resource, quantity);
                } else {
                    quantity = Integer.parseInt(input);
                    map.put(resource, quantity);
                }
            }
            count++;
            input = scan.nextLine();
        }

        for (String s : map.keySet()) {
            System.out.println(s + " -> " + map.get(s));
        }
    }
}
