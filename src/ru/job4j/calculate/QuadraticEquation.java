package ru.job4j.calculate;

/**
 * класс вычисляет значение квадратного уравнения
 */

public class QuadraticEquation {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = QuadraticEquation.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
