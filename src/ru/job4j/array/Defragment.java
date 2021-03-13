package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        boolean ifExistNotNullElement = true;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null && ifExistNotNullElement) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                    if (i == array.length - 1) {
                        ifExistNotNullElement = false;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
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
