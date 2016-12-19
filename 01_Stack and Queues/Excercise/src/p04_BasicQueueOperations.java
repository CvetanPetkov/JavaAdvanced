import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] commands = scan.nextLine().split(" ");
        String[] nums = scan.nextLine().split(" ");
        Queue<Integer> queue = new ArrayDeque<>();
        int polls = Integer.parseInt(commands[1]);
        int toCheck = Integer.parseInt(commands[2]);

        for (String num : nums) {
            int numToAdd = Integer.parseInt(num);
            queue.add(numToAdd);
        }
        for (int i = 0; i < polls; i++) {
            queue.poll();
        }
        if (queue.contains(toCheck)) {
            System.out.println("true");
        } else {
            if (queue.size() == 0) {
                System.out.println("0");
            } else {
                int bestNum = queue.poll();
                while (queue.size() > 0) {
                    int temp = queue.poll();
                    if (temp < bestNum) {
                        bestNum = temp;
                    }
                }
                System.out.println(bestNum);
            }
        }
    }
}
