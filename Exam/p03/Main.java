package Exam_Retake.p03_NMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = reader.readLine();

            if (line.equals("---NMS SEND---")) {
                break;
            }

            sb.append(line);
        }

        String delimeter = reader.readLine();

        for (int i = 0; i < sb.length()-1; i++) {
            String one = sb.substring(i, i+1);
            String next = sb.substring(i+1, i+2);
            //System.out.println(one + " " + next);
            if (one.compareToIgnoreCase(next) > 0) {
                //System.out.println(i);
                sb.insert(i+1, delimeter);
                i+= delimeter.length();
            }
        }

        System.out.println(sb.toString());
    }
}
