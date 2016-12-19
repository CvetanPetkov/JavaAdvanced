import java.util.Scanner;
import java.util.Stack;

public class p07_BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Stack<Character> openPairs = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                openPairs.push(ch);
            } else {
                if (openPairs.isEmpty()) {
                    isBalanced = false;
                    break;
                }
            switch (ch) {
                case '}':
                    char pair = openPairs.pop();
                    if (pair != '{') {
                        isBalanced = false;
                    }
                    break;
                case ']':
                    char pairr = openPairs.pop();
                    if (pairr != '[') {
                        isBalanced = false;
                    }
                    break;
                case ')':
                    char pairrr = openPairs.pop();
                    if (pairrr != '(') {
                        isBalanced = false;
                    }
                    break;
                }
            }
        }

        if (isBalanced && openPairs.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
