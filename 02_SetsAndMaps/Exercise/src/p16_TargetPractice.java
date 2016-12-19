import java.util.Scanner;

public class p16_TargetPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimentions = scan.nextLine().split(" ");
        int r = Integer.parseInt(dimentions[0]);
        int c = Integer.parseInt(dimentions[1]);
        String snake = scan.nextLine();
        String[] commands = scan.nextLine().split(" ");
        int rowShot = Integer.parseInt(commands[0]);
        int collShot = Integer.parseInt(commands[1]);
        int radiusShot = Integer.parseInt(commands[2]);
        char[][] matrix = new char[r][c];
        char[] snakechars = snake.toCharArray();

        int counter = 1;
        int s = 0;
            for (int i = r - 1; i >= 0; i--) {
                if (counter % 2 != 0) {
                    for (int j = c - 1; j >= 0; j--) {
                        matrix[i][j] = snakechars[s];
                        if (s == snakechars.length-1) {
                            s = -1;
                        }
                        s++;
                    }
                    counter++;
                } else if (counter % 2 == 0){
                    for (int j = 0; j < c; j++) {
                        matrix[i][j] = snakechars[s];
                        if (s == snakechars.length-1) {
                            s = -1;
                        }
                        s++;
                    }
                    counter++;
                }
            }

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if ((row - rowShot) * (row - rowShot) + (col - collShot) * (col - collShot) <= radiusShot * radiusShot) {
                    matrix[row][col] = ' ';
                }
            }
        }

        if (r > 1) {
            for (int col = 0; col < c; col++) {
                boolean isFalling = true;
                while (isFalling) {
                    boolean swap = false;
                    for (int row = r - 1; row > 0; row--) {
                        if (matrix[row][col] == ' ' && matrix[row - 1][col] != ' ') {
                            char temp = matrix[row][col];
                            matrix[row][col] = matrix[row - 1][col];
                            matrix[row - 1][col] = temp;
                            swap = true;
                            isFalling = true;
                        } else if (!swap) {
                            isFalling = false;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
