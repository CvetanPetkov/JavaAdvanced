import java.util.HashSet;
import java.util.Scanner;

public class p02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sets = scan.nextLine().split(" ");
        int n = Integer.parseInt(sets[0]);
        int m = Integer.parseInt(sets[1]);
        HashSet<Integer> setN = new HashSet<>();
        HashSet<Integer> setM = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setN.add(Integer.parseInt(scan.nextLine()));
        }
        for (int i = 0; i < m; i++) {
            setM.add(Integer.parseInt(scan.nextLine()));
        }

        for (Integer integer : setM) {
            if (setN.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
