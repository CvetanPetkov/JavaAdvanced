import java.util.LinkedHashSet;
import java.util.Scanner;

public class p01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            if (!set.contains(input)) {
                set.add(input);
                System.out.println(input);
            }
        }
    }
}
