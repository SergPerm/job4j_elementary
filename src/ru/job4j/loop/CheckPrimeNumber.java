package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number != 1){
            for (int n = 2; n <= number-1; n++) {
                if (number / n > 1 && number % n == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
