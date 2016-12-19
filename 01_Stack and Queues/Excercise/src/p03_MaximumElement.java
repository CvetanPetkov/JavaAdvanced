import java.util.Scanner;
import java.util.Stack;

public class p03_MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);
            if (command == 1) {
                int num = Integer.parseInt(input[1]);
                stack.add(num);
                if (num >= max) {
                    max = num;
                    maxStack.add(max);
                }
            } else if (command == 2) {
                int popped = stack.pop();
                if (max == popped) {
                    maxStack.pop();
                    if (maxStack.size() > 0) {
                        max = maxStack.peek();
                    } else {
                        max = Integer.MIN_VALUE;
                    }
                }
            } else {
                System.out.println(max);
            }
        }
    }
}
