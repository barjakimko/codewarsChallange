package org.example.lvl_6.Xbonacci;

import java.util.Arrays;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] results = Arrays.copyOf(s, n);
        int arraySize = s.length;

        while (arraySize < n) {
            results[arraySize] = results[arraySize - 1] + results[arraySize - 2] + results[arraySize - 3];
            arraySize++;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double[]{1, 1, 1}, 10)));
    }
}


