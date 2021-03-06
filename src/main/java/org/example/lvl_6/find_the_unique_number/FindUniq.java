package org.example.lvl_6.find_the_unique_number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindUniq {

    public static double findUniq(double arr[]) {
        // Do the magic

        HashMap<Double, Integer> frequency = new HashMap<>();

        for (double value : arr) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        double result = 0.0;

        List<Double> collect = frequency.keySet().stream().filter(
                value -> frequency.get(value).equals(1)
        ).collect(Collectors.toList());

        return collect.isEmpty() ? result : collect.get(0);
    }

    public static double findUniqStream(double arr[]) {
        // Do the magic

        return Arrays.stream(arr).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0.0);
    }
}
