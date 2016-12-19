import java.util.Scanner;
import java.util.TreeSet;

public class p03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] compounds = scan.nextLine().split(" ");
            for (String compound : compounds) {
                set.add(compound);
            }
        }

        for (String s : set) {
            System.out.print(s +" ");
        }
    }
}
