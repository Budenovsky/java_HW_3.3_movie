package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
    private int limit = 10;
    private Movie[] movies = new Movie[0];

    public  void add (Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[movies.length];
        for (int i = 0; i < result.length; i++) {
            if (i > limit - 1) {
                i = limit - 1;
            }
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public AfishaManager() {
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }
}
