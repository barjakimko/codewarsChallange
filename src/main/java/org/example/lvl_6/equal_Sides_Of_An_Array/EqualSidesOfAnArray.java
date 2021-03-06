package org.example.lvl_6.equal_Sides_Of_An_Array;

import java.util.Arrays;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        // your code

        for (int i = 0; i < arr.length; i++) {
            int sum = Arrays.stream(Arrays.copyOfRange(arr, i, arr.length)).sum();
            int sum1 = Arrays.stream(Arrays.copyOfRange(arr, 0, i + 1)).sum();

            if (sum == sum1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{1, 1, 5, 1, 1, 1}));
    }
}

