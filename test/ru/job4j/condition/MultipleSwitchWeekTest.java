package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        int expected = 1;
        assertThat(MultipleSwitchWeek.numberOfDay ("Monday"), is(expected));
    }
}