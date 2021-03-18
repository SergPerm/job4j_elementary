package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoffeeMachineTest {

    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = CoffeeMachine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] rsl = CoffeeMachine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by22() {
        int[] expected = {10, 10, 5, 2, 1};
        int[] rsl = CoffeeMachine.change(50, 22);
        assertThat(rsl, is(expected));
    }
}