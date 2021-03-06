package org.example.lvl_7.Exes_and_Ohs;

import java.util.HashMap;

public class XO {

    public static boolean getXO(String str) {

        // Good Luck!!
        HashMap<String, Integer> results = new HashMap<>();

        results.put("x", 0);
        results.put("o", 0);

        for (String letter : str.split("")) {
            if (letter.equalsIgnoreCase("x")) {
                results.put("x", results.get("x") + 1);
            }
            if (letter.equalsIgnoreCase("o")) {
                results.put("o", results.get("o") + 1);
            }
        }
        return results.get("o").equals(results.get("x"));
    }

    public static void main(String[] args) {

        System.out.println(getXO("xxxoooO"));

    }
}
