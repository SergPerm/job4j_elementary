package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(Matrix.multiple(2), is(expected));
    }

    @Test
    public void when3on3() {
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(Matrix.multiple(3), is(expected));
    }
}