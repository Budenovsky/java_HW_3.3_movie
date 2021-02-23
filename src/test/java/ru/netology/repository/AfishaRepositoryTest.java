package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository();

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
public void shouldSave() {
        repository.save(first);

        Movie[] actual = repository.save();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }

}