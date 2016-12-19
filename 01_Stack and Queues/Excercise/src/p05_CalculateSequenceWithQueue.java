import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p05_CalculateSequenceWithQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.nextLine());
        Queue<Long> queue = new ArrayDeque<>();
        queue.add(n);

        for (int i = 0; i < 5; i++) {
            long temp = queue.peek();
            queue.add(temp + 1);
            queue.add(2*temp + 1);
            queue.add(temp + 2);
            System.out.print(queue.remove() + " ");
        }
    }
}
