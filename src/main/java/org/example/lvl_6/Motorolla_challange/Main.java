package org.example.lvl_6.Motorolla_challange;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("^vv<v"));
        System.out.println(solution2(1, 2, new int[]{1, 2, 11, 7, 1, 42}));
        System.out.println(solution3("BAONXXOOLBALLOON"));
    }

    public static int solution(String text) {

        String[] split = text.split("");

        Integer freq1 = Collections.frequency(Arrays.asList(split), ">");
        Integer freq2 = Collections.frequency(Arrays.asList(split), "<");
        Integer freq3 = Collections.frequency(Arrays.asList(split), "^");
        Integer freq4 = Collections.frequency(Arrays.asList(split), "v");

        List<Integer> frequency = new ArrayList<>();
        frequency.add(freq1);
        frequency.add(freq2);
        frequency.add(freq3);
        frequency.add(freq4);

        Integer max = frequency.stream().max(Integer::compareTo).get();

        Integer total = frequency.stream().reduce(0, (a, b) -> a + b);

        return total - max;
    }

    public static int solution2(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }

    //    int sum = data.values().stream().mapToInt(Integer::parseInt).sum();
    public static int solution3(String s) {

        List<String> strings = Arrays.asList(s.split(""));

        Map<String, Long> letterOccurence = strings.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
        System.out.println(letterOccurence);

        if (letterOccurence.getOrDefault("B", (long) 0) >= 1) {
            letterOccurence.remove("B");
        } else return 0;

        if (letterOccurence.getOrDefault("A", (long) 0) >= 1) {
            letterOccurence.remove("A");
        } else return 0;

        if (letterOccurence.getOrDefault("L", (long) 0) >= 2) {
            letterOccurence.remove("L");
        } else return 0;

        if (letterOccurence.getOrDefault("O", (long) 0) >= 2) {
            letterOccurence.remove("O");
        } else return 0;

        if (letterOccurence.getOrDefault("N", (long) 0) >= 1) {
            letterOccurence.remove("N");
        } else return 0;

        System.out.println(letterOccurence);

        return letterOccurence.size();
    }
}
