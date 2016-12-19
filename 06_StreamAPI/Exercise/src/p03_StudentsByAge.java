import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class p03_StudentsByAge {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String readLine = null;

            while (!Objects.equals(readLine = br.readLine(), "END")) {
                String[] tokens = readLine.split("[\\s]+");
                String name = tokens[0] + " " + tokens[1];
                Integer years = Integer.valueOf(tokens[2]);
                students.put(name, years);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students = students.entrySet().stream()
                .filter( entry -> entry.getValue() >= 18 && entry.getValue() <= 24)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e, e2) -> e,
                        LinkedHashMap<String, Integer>::new));

        for (Map.Entry<String, Integer> Entry : students.entrySet()) {
            System.out.println(Entry.getKey() + " " + Entry.getValue());
        }
    }
}
