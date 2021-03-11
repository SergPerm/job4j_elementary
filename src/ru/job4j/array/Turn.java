package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int lastArrayIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
           array[i] = array[lastArrayIndex - i];
           array[lastArrayIndex - i] = temp;
        }
        return array;
    }
}
