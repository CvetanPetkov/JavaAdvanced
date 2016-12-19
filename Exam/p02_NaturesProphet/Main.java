package Exam_Retake.p03_NMS.p02_NaturesProphet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = reader.readLine().split("[\\s]+");

        Integer[] dimentions = parseDimentions(line1);
        List<ArrayList<Integer>> matrix = createMatrix(dimentions);

        while (true) {
            String[] coordinates = reader.readLine().split("[\\s]+");
            if (coordinates[0].equals("Bloom")) {
                break;
            }

            int row = Integer.valueOf(coordinates[0]);
            int col = Integer.valueOf(coordinates[1]);
            //int checker = 0;

            for (int i = 0; i < matrix.get(row).size(); i++) {
                int filler = matrix.get(row).get(i) + 1;
                matrix.get(row).set(i, filler);
            }

            for (int i = 0; i < matrix.size(); i++) {
                int filler = matrix.get(i).get(col) + 1;
                if (i != row) {
                    matrix.get(i).set(col, filler);
                }
            }

        }

        printMatrix(matrix);
    }

    private static void printMatrix(List<ArrayList<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> createMatrix(Integer[] dimentions) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int filler = 0;
        for (int i = 0; i < dimentions[0]; i++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < dimentions[1]; j++) {
                matrix.get(i).add(filler);
            }
        }
        return matrix;
    }

    private static Integer[] parseDimentions(String[] line1) {
        Integer[] dimentions = new Integer[2];
        for (int i = 0; i < 2; i++) {
            dimentions[i] = Integer.valueOf(line1[i]);
        }
        return dimentions;
    }
}
