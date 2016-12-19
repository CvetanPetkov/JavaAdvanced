package Exam_Retake.p03_NMS.p04_AshesOfRoses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, TreeMap<String, Integer>> regions = new TreeMap<>();
        Pattern pat = Pattern.compile("<([A-Z][a-z]+)>.<([a-zA-Z0-9]+)>.([0-9]+)");

        while (true) {
            String line = reader.readLine();
            if (line.equals("Icarus, Ignite!")) {
                break;
            }

            Matcher match = pat.matcher(line);

            while (match.find()) {
                String region = match.group(1);
                String color = match.group(2);
                Integer amount = Integer.valueOf(match.group(3));

                if (!regions.containsKey(region)) {
                    regions.put(region, new TreeMap<>());
                    regions.get(region).put(color, amount);
                } else {
                    if (!regions.get(region).containsKey(color)) {
                        regions.get(region).put(color, amount);
                    } else {
                        Integer newAmount =
                                regions.get(region).get(color) + amount;
                        regions.get(region).put(color, newAmount);
                    }

                }
            }
        }

        for (String s : regions.keySet()) {
            System.out.println(s);
            for (Map.Entry<String, Integer> stringTreeMapEntry : regions.get(s).entrySet()) {
                System.out.printf("*--%s | %d\n",
                        stringTreeMapEntry.getKey(), stringTreeMapEntry.getValue());
            }
        }


        regions.entrySet().stream()
                .sorted((e1, e2) -> {
                    e2.getValue().entrySet().stream()
                            .sorted((e3, e4) -> e4.getValue().compareTo(e3.getValue()))
                            .forEach(System.out::println);
                    return 0;
                });


    }
}
