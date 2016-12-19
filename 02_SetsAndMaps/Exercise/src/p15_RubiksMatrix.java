import java.util.Scanner;

public class p15_RubiksMatrix {
    static int r;
    static int c;
    static int moves;
    static int[][] matrix;
    static int[][] compareMatrix;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split(" ");
        r = Integer.parseInt(dimensions[0]);
        c = Integer.parseInt(dimensions[1]);
        moves = Integer.parseInt(scan.nextLine());
        matrix = new int[r][c];
        compareMatrix = new int[r][c];

        int filler = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = filler;
                compareMatrix[i][j] = filler;
                filler++;
            }
        }

        for (int i = 0; i < moves; i++) {
            String[] commands = scan.nextLine().split(" ");
            int rowColNumb = Integer.parseInt(commands[0]);
            int steps = Integer.parseInt(commands[2]);
            if (commands[1].equals("up")) {
                shiftUp(rowColNumb, steps);
            } else if (commands[1].equals("down")) {
                shiftDown(rowColNumb, steps);
            }else if (commands[1].equals("left")) {
                shiftLeft(rowColNumb, steps);
            } else if (commands[1].equals("right")) {
                shiftRight(rowColNumb, steps);
            }
        }

        rearrangeMatrix();
    }

    private static void rearrangeMatrix() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == compareMatrix[i][j]) {
                    System.out.println("No swap required");
                } else {
                    int temp = compareMatrix[i][j];
                    int currNum = matrix[i][j];
                    for (int k = 0; k < r; k++) {
                        for (int l = 0; l < c; l++) {
                            if (temp == matrix[k][l]) {
                                matrix[i][j] = matrix[k][l];
                                matrix[k][l] = currNum;
                                System.out.printf("Swap (%d, %d) with (%d, %d)" ,
                                                    i, j, k, l);
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }

    private static void shiftRight(int rowColNumb, int steps) {
        steps %= c;
        for (int i = 0; i < steps; i++) {
            int temp = matrix[rowColNumb][c-1];
            for (int j = c-1; j > 0; j--) {
                matrix[rowColNumb][j] = matrix[rowColNumb][j-1];
            }
            matrix[rowColNumb][0] = temp;
        }
    }

    private static void shiftLeft(int rowColNumb, int steps) {
        steps %= c;
        for (int i = 0; i < steps; i++) {
            int temp = matrix[rowColNumb][0];
            for (int j = 0; j < c-1; j++) {
                matrix[rowColNumb][j] = matrix[rowColNumb][j+1];
            }
            matrix[rowColNumb][c-1] = temp;
        }
    }

    private static void shiftDown(int rowColNumb, int steps) {
        steps %= r;
        for (int i = 0; i < steps; i++) {
            int temp = matrix[r-1][rowColNumb];
            for (int j = r-1; j > 0; j--) {
                matrix[j][rowColNumb] = matrix[j-1][rowColNumb];
            }
            matrix[0][rowColNumb] = temp;
        }
    }

    private static void shiftUp(int rowColNumb, int steps) {
        steps %= r;
        for (int i = 0; i < steps; i++) {
            int temp = matrix[0][rowColNumb];
            for (int j = 0; j < r-1; j++) {
                matrix[j][rowColNumb] = matrix[j+1][rowColNumb];
            }
            matrix[r-1][rowColNumb] = temp;
        }
    }
}