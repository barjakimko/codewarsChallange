package org.example.lvl_5.Simple_Pig_latin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {
    public static String pigIt(String str) {
        // Write code here

        return Arrays.stream(str.split(" ")).
                map(value -> value.substring(1) + value.charAt(0) + "ay").collect(Collectors.joining(" "));
    }
}
