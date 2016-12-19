import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class p17_Legoblocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1) {
                    String[] line = scan.nextLine().trim().split(" +");
                    stack = new Stack<>();
                    for (String s : line) {
                        stack.push(s);
                    }
                    ArrayList<String> getLine = new ArrayList<>();
                    int repeats = stack.size();
                    for (int k = 0; k < repeats; k++) {
                        getLine.add(stack.pop());
                    }
                    list.add(getLine);
                } else {
                    String[] line = scan.nextLine().trim().split(" +");
                    ArrayList<String> getLine = new ArrayList<>();
                    for (String s : line) {
                        getLine.add(s);
                    }
                    list.add(getLine);
                }
            }
        }

        for (int i = 0; i < list.size() / 2; i++) {
                list.get(i).addAll(list.get(list.size()/2+i));
        }
        int startPoint = list.size() / 2;
        int repeats = list.size();
        for (int i = startPoint; i < repeats; i++) {
            list.remove(list.size()-1);
        }

        boolean isEqual = false;
        for (int i = 0; i < list.size()-1; i++) {
            int currCount = list.get(i).size();
            int nextCount = list.get(i+1).size();
            if (currCount == nextCount) {
                isEqual = true;
            } else {
                isEqual = false;
                break;
            }
        }

        int totalCount = 0;
        for (int i = 0; i < list.size(); i++) {
            totalCount += list.get(i).size();
        }

        if (isEqual) {
            for (ArrayList<String> strings : list) {
                System.out.println(strings);
            }
        } else {
            System.out.println("The total number of cells is: " + totalCount);
        }
    }
}
