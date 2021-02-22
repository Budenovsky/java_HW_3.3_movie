package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;


import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    //тесты без лимита

    AfishaManager manager = new AfishaManager();

    private Movie first = new Movie();
    private Movie second = new Movie();
    private Movie third = new Movie();
    private Movie fourth = new Movie();
    private Movie fifth = new Movie();
    private Movie sixth = new Movie();
    private Movie seventh = new Movie();
    private Movie eighth = new Movie();
    private Movie ninth = new Movie();
    private Movie tenth = new Movie();
    private Movie eleventh = new Movie();

    @Test
    public void shouldAddWithoutLimitWhenZero() {
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithoutLimitWhenOne() {
        manager.add(first);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithoutLimitWhenTwo() {
        manager.add(first);
        manager.add(second);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithoutLimitWhenNine() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithoutLimitWhenTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithoutLimitWhenEleven() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}