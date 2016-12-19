import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class p09_StudentsEnrolled {
    public static void main(String[] args) {
        List<String> students = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String readLine = null;

            while (!Objects.equals(readLine = br.readLine(), "END")) {
                students.add(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students = students.stream()
                .filter(student -> {
                    String[] tokens = student.split(" ");
                    String code = tokens[0];
                    return code.endsWith("14") || code.endsWith("15");
                })
                .map(student -> {
                    String[] tokens = student.split(" ");
                    String grades = tokens[1] + " " + tokens[2] + " " +
                            tokens[3] + " " + tokens[4];
                    return grades;
                })
                .collect(Collectors.toList());

        for (String student : students) {
            System.out.println(student);
        }

    }
}
