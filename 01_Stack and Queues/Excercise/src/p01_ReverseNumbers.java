import java.util.Scanner;
import java.util.Stack;

public class p01_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String num : nums) {
            stack.add(Integer.parseInt(num));
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
