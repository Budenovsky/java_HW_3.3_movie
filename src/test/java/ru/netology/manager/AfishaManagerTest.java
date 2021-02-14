package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;


import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();

    private Movie first = new Movie();
    private Movie second = new Movie();
    private Movie third = new Movie();
//    private Movie fourth = new Movie();
//    private Movie fifth = new Movie();
//    private Movie sixth = new Movie();
//    private Movie seventh = new Movie();
//    private Movie eighth = new Movie();
//    private Movie ninth = new Movie();
//    private Movie tenth = new Movie();
//    private Movie eleventh = new Movie();
//    private Movie twelfth = new Movie();

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        manager.add(eleventh);
//        manager.add(twelfth);

    }

    @Test
    public void shouldAdd() {

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[] {third, second, first};

        assertArrayEquals(expected, actual);
    }
}