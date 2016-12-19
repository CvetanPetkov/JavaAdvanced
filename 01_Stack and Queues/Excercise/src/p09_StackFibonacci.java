import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class p09_StackFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Stack<BigInteger> stack = new Stack<>();

        stack.push(BigInteger.valueOf(1));
        stack.push(BigInteger.valueOf(1));

        for (int i = 0; i < n - 1; i++) {
            BigInteger prevous = stack.pop();
            BigInteger prePrevous = stack.peek();
            stack.push(prevous);
            BigInteger current = prePrevous.add(prevous);
            stack.push(current);
        }

        System.out.println(stack.peek());
    }
}
