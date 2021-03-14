package ru.job4j.array;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class Defragment {
    public static String[] compress(String[] array) {
//        Instant start = Instant.now();
//        boolean ifExistNotNullElement = true;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
//            if (array[index] == null && ifExistNotNullElement) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
//                    if (i == array.length - 1) {
//                        ifExistNotNullElement = false;
//                    }
                }
            }
        }
//        Instant finish = Instant.now();
//        long elapsed = Duration.between(start, finish).toMillis();
//        System.out.println("Прошло времени, мс: " + elapsed);
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, null, "wanna", null, "be", null, "compressed", null, null};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
