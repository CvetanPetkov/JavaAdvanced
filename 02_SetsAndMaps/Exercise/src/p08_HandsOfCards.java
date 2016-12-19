import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class p08_HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        HashSet<String> set = new HashSet<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] data = input.split(":");
            String name = data[0];
            String[] cards = data[1].trim().split(", ");
            set.clear();
            for (int i = 0; i < cards.length; i++) {
                set.add(cards[i]);
            }
            for (String s : set) {
                String power = s.substring(0, s.length()-1);
                String type = s.substring(s.length()-1);
                int typeVal = 0;
                switch (type) {
                    case "S": typeVal = 4; break;
                    case "H": typeVal = 3; break;
                    case "D": typeVal = 2; break;
                    case "C": typeVal = 1; break;
                }
                    int value = 0;
                    switch (power) {
                        case "2": value = 2 * typeVal; break;
                        case "3": value = 3 * typeVal; break;
                        case "4": value = 4 * typeVal; break;
                        case "5": value = 5 * typeVal; break;
                        case "6": value = 6 * typeVal; break;
                        case "7": value = 7 * typeVal; break;
                        case "8": value = 8 * typeVal; break;
                        case "9": value = 9 * typeVal; break;
                        case "10": value = 10 * typeVal; break;
                        case "J": value = 11 * typeVal; break;
                        case "Q": value = 12 * typeVal; break;
                        case "K": value = 13 * typeVal; break;
                        case "A": value = 14 * typeVal; break;
                    }
                if (!map.containsKey(name)) {
                    map.put(name, value);
                } else {
                    int currValue = map.get(name);
                    value += currValue;
                    map.put(name, value);
                }
            }
            input = scan.nextLine();
        }

        for (String s : map.keySet()) {
            System.out.print(s + ":");
            System.out.println(" " + map.get(s));
        }
    }
}
