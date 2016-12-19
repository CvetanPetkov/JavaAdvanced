import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p04_SortStudents {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String readLine = null;

            while (!Objects.equals(readLine = br.readLine(), "END")) {
                students.add(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students = students.stream()
                .sorted((student1, student2) -> {
                    String[] tokens1 = student1.split(" ");
                    String firstName1 = tokens1[0];
                    String lastName1 = tokens1[1];

                    String[] tokens2 = student2.split(" ");
                    String firstName2 = tokens2[0];
                    String lastName2= tokens2[1];

                    if (lastName1.equals(lastName2)) {
                        return firstName2.compareTo(firstName1);
                    }
                    return lastName1.compareTo(lastName2);
                })
                .collect(Collectors.toList());

        for (String student : students) {
            System.out.println(student);
        }
    }
}
