package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[2];
        array[2] = array[1];
        array[1] = temp;
        temp = array[4];
        array[4] = array[3];
        array[3] = temp;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
