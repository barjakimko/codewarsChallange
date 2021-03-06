package org.example.lvl_4.the_observed_pin;

import java.util.*;

public class ObservedPin {

    public static List<String> getPINs(String observed) {

        List<String> originalNumbers = Arrays.asList(observed.split(""));
        List<List<String>> possibilityNumbers = new ArrayList<>();

        for (String number : originalNumbers) {
            possibilityNumbers.add(Possibilities.values()[Integer.parseInt(number) - 1].possibilitiesList);
        }

        System.out.println(possibilityNumbers);

        Set<String> results = new HashSet<>(possibilityNumbers.get(0));
        System.out.println(results);
        possibilityNumbers.remove(0);
        System.out.println(possibilityNumbers);

        System.out.println(results);
        for (String number : results) {
            for (List<String> addedNumbers : possibilityNumbers) {
                for (String otherNumber : addedNumbers) {
                    results.add(number + otherNumber);
                }
            }
        }

        System.out.println(results);

        return new ArrayList<>(results);


    } // getPINs


    public enum Possibilities {
        ONE(Arrays.asList("1", "2", "4")),
        TWO(Arrays.asList("1", "2", "3", "5")),
        THREE(Arrays.asList("2", "3", "6")),
        FOUR(Arrays.asList("1", "4", "5", "7")),
        FIVE(Arrays.asList("2", "4", "5", "6", "8")),
        SIX(Arrays.asList("3", "5", "6", "9")),
        SEVEN(Arrays.asList("4", "7", "8")),
        EIGHT(Arrays.asList("5", "7", "8", "9", "0")),
        NINE(Arrays.asList("6", "8", "9")),
        ZERO(Arrays.asList("0", "9"));

        private List<String> possibilitiesList = new ArrayList<>();

        Possibilities(List<String> possibilitiesList) {
            this.possibilitiesList = possibilitiesList;
        }
    }

    public static void main(String[] args) {
        getPINs("111");
    }

}
