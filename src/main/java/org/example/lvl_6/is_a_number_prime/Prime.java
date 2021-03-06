package org.example.lvl_6.is_a_number_prime;

public class Prime {
    public static boolean isPrime(int num) {
        int divisors = 0;

        if (num <= 1) {
            return false;
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisors++;
                    if (divisors > 2) {
                        return false;
                    }
                }
            }
        }
        return divisors == 2;
    }
}
