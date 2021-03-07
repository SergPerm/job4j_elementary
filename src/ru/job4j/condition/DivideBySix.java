package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 == 0) {
                rsl = "Исходное число не делится на 3, но является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return rsl;
    }
}
