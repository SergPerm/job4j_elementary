package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        assertThat(MatrixCheck.monoHorizontal(board, 1), is(true));
    }

    @Test
    public void whenNotHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.monoHorizontal(board, 1), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        assertThat(MatrixCheck.monoVertical(board, 1), is(true));
    }

    @Test
    public void whenNotHasMonoVertical() {
        char[][] board = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.monoVertical(board, 1), is(false));
    }

    @Test
    public void whenHasDiagonal() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expect = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(board), is(expect));
    }

    @Test
    public void whenNotHasDiagonal() {
        char[][] board = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expect = {' ', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(board), is(expect));
    }
}