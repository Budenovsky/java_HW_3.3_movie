package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTestWithLimit {
    AfishaManager manager = new AfishaManager();

    private Movie first = new Movie();
    private Movie second = new Movie();
    private Movie third = new Movie();

    @Test
    public void shouldAddWithtLimitWhenZero() {
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithtLimitWhenOne() {
        manager.add(first);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithtLimitWhenTwo() {
        manager.add(first);
        manager.add(second);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddWithtLimitWhenThree() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second};

        assertArrayEquals(expected, actual);
    }
}