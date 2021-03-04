package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax21To20Then21() {
        int result = Max.max(21, 20);
        assertThat(result, is(21));
    }

    @Test
    public void whenMax22To22Then22() {
        int result = Max.max(22, 22);
        assertThat(result, is(22));
    }
}