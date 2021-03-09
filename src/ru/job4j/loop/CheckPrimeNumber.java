package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int n = 2;
        if (number != 1){
            while (n <= number){
                if (number / n == 1 && number % n == 0)
                    break;
                if (number / n > 1 && number % n == 0) {
                    prime = false;
                    break;
                }
                n ++;
            }
        }
        return prime;
    }
}
