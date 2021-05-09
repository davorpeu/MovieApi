package com.Separion.MovieApi.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;


    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public List<Movie> getMovies(){
        return movieRepository.findAll(


                );
    }



    public void addNewMovie(Movie movie) {
        Optional<Movie> movieOptional = movieRepository
                .findMovieByTitle(movie.getTitle());
        if (movieOptional.isPresent()) {
            throw  new IllegalStateException("Movie already exists in db");
        }
        movieRepository.save(movie);

    }


}
