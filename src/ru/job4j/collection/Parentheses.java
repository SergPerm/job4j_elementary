package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data[0] == ')') {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                sum++;
            } else {
                sum--;
            }
        }
        return (sum != 0) ? false : true;
    }
}
