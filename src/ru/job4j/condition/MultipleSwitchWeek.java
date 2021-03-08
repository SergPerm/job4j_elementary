package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name.toLowerCase()) {
            case "понедельник", "monday" -> 1;
            case "вторник", "tuesday" -> 2;
            case "среда", "wednesday" -> 3;
            case "четверг", "thursday" -> 4;
            case "пятница", "friday" -> 5;
            case "суббота", "saturday" -> 6;
            case "воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }
}
