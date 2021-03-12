package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenLastEqualsThenTrue() {
        int[] left = {1, 2, 3, 8};
        int[] right = {2, 3, 8};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(true));
    }

    @Test
    public void whenLastNotEqualsThenFalse() {
        int[] left = {1, 2, 3, 8};
        int[] right = {2, 3, 7};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(false));
    }
}