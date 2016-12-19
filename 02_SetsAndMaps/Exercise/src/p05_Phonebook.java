import java.util.HashMap;
import java.util.Scanner;

public class p05_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        HashMap<String, String> map = new HashMap<>();

        while (!input.equals("search")) {
            String[] input2 = input.split("-");
            String name = input2[0];
            String number = input2[1];
            if (!map.containsKey(name)) {
                map.put(name, number);
            } else {
                map.put(name, number);
            }
            input = scan.nextLine();
        }

        if (input.equals("search")) {
            input = scan.nextLine();
            while (!input.equals("stop")) {
                if (map.containsKey(input)) {
                    System.out.println(input + " -> " + map.get(input));
                } else {
                    System.out.printf("Contact %s does not exist.", input);
                    System.out.println();
                }
                input = scan.nextLine();
            }
        }
    }
}
