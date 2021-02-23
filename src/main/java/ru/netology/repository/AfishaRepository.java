package ru.netology.repository;

import ru.netology.domain.Movie;
import ru.netology.manager.AfishaManager;

public class AfishaRepository {
    private Movie[] movies = new Movie[0];

    public  void save (Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
//        int length = movies.length;
//        Movie[] result = new Movie[length]; //TODO: delete
//        for (int i = 0; i < result.length; i++) {
//            int index = length - i - 1;
//            result[i] = movies[index];
//        }
        return movies;
    }

    public Movie[] findById(int id) {
        Movie[] tmp = new Movie[id];
        movies  = tmp;
        return movies;
    }
}

    public Movie[] removeById (int id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        Movie[] tmp = new Movie[0];
        movies = tmp;
    }
}
