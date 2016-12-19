import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p01_StudentsByGroup {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String readLine = null;

            while (!Objects.equals(readLine = br.readLine(), "END")) {
                String[] inputTokens = readLine.split("[\\s]+");
                String name = inputTokens[0] + " " + inputTokens[1];
                Integer group = Integer.valueOf(inputTokens[2]);

                students.put(name, group);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students = students.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .collect(Collectors.toMap(
                        element -> element.getKey(), element -> element.getValue()));

        for (String student : students.keySet()) {
            System.out.println(student);
        }

        List<String> list = new LinkedList<>();
    }
}
