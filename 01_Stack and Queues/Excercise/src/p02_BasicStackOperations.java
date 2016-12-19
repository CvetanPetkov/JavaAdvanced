import java.util.Scanner;
import java.util.Stack;

public class p02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] commLine = scan.nextLine().split(" ");
        String[] nums = scan.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        int pops = Integer.parseInt(commLine[1]);
        int contNum = Integer.parseInt(commLine[2]);

        for (String num : nums) {
            stack.add(Integer.parseInt(num));
        }
        for (int i = 0; i < pops; i++) {
            stack.pop();
        }

        if (stack.contains(contNum)) {
            System.out.println("true");
        } else {
            if (stack.size() == 0) {
                System.out.println("0");
            } else {
                int bestNum = stack.pop();
                while (stack.size() > 0) {
                    int temp = stack.pop();
                    if (bestNum > temp) {
                        bestNum = temp;
                    }
                }
                System.out.println(bestNum);
            }
        }
    }
}
