package org.example.lvl_6.playing_with_digits;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code
        String[] numbers = String.valueOf(n).split("");

        double sum = 0;

        for (String number : numbers) {
            sum += Math.pow(Double.valueOf(number), p);
            p++;
        }

        if (Math.round(sum / n) == sum / n) {
            return (long) sum / n;
        } else return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(92, 1));
    }
}
