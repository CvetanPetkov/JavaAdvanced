import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p02_StudentsByFirstAndLastName {
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
                    String[] inputTokens = student.split(" ");
                    String firstName = inputTokens[0];
                    String lastName = inputTokens[1];

                    return firstName.compareTo(lastName) < 0;
                }).collect(Collectors.toList());

        for (String student : students) {
            System.out.println(student);
        }
    }
}
