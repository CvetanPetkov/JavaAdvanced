import java.util.LinkedHashMap;
import java.util.Scanner;

public class p07_FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        String name = new String();
        String email = new String();
        int count = 1;

        while (!input.equals("stop")) {
            if (count % 2 != 0) {
                name = input;
            } else {
                email = input;
                if (!email.endsWith("us") && !email.endsWith("uk")) {
                    map.put(name, email);
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
