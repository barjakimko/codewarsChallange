package org.example.lvl_6.CamelCaseMethod;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseMethod {

    public static String camelCaseOther(String str) {
        return (str == null || str.isEmpty())?"":Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .collect(Collectors.joining());
    }


    public static String camelCase(String str) {

        return Arrays.stream(str.trim().split(" "))
                .map(word -> camelCaseSupp(word))
                .collect(Collectors.joining(""));
    }

    public static String camelCaseSupp(String word) {
        if (word.length() > 1) {
            return word.substring(0, 1).toUpperCase() + word.substring(1);
        } else {
            return word.toUpperCase();
        }
    }
}
