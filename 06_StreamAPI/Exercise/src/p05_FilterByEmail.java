import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class p05_FilterByEmail {
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
                .filter(student -> student.contains("@gmail.com"))
                .map(student -> {
                    String[] tokens = student.split("[\\s]+");
                    String firstName = tokens[0];
                    String lastName = tokens[1];
                    return firstName + " " + lastName;
                })
                .collect(Collectors.toList());

        for (String student : students) {
            System.out.println(student);
        }
    }
}