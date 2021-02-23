package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;
import ru.netology.repository.AfishaRepository;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
public class AfishaManager {
    private AfishaRepository repository;
    private int limit = 10;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }


    public void add(Movie movie) {
        repository.save(movie);
    }

    public Movie[] getAll() {
        Movie[] movies = repository.findAll();
        int length = movies.length;
        if (length > limit){
            length = limit;
        }
        Movie[] result = new Movie[length];
        for (int i = 0; i < result.length; i++) {
            int index = length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
