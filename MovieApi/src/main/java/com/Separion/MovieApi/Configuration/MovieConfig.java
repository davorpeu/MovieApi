package com.Separion.MovieApi.Configuration;

import com.Separion.MovieApi.Movie.Movie;
import com.Separion.MovieApi.Movie.MovieRepository;
import com.Separion.MovieApi.TvShow.TvShow;
import com.Separion.MovieApi.TvShow.TvShowRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import java.time.LocalDate;

import java.util.List;

@Configuration
public class MovieConfig {

    @Bean
    @Primary
    CommandLineRunner commandLineRunner(MovieRepository movieRepository){
        return  args -> {
            Movie sand = new Movie(
                    "Sand",
                    2000,
                    "R",
                    LocalDate.of(2,2,2),
                    "89 min",
                    "Drama",
                    "Matt Palmieri",
                    "Matt Palmieri",
                    "Michael Vartan, Norman Reedus, Kari Wuhrer, Marshall Bell",
                    "A young man tries running from his past by hiding from his two violent brothers, only to have them track and harass him and his friends.",
                    "English",
                    "https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BMjUxNjU2MzgxM15BMl5BanBnXkFtZTcwNDAxMTkxMQ@@._V1_SX300.jpg",
                    "movie"
            );




            movieRepository.saveAll(
                    List.of(sand)
            );




        } ;


    }
//    @Bean
    CommandLineRunner commandLineRunner(TvShowRepository tvShowRepository) {
        return args -> {
            TvShow show = new TvShow(

                    "https://www.tvmaze.com/shows/139/girls",
                    "Girls",
                    "Scripted",
                    "English",
                    "Ended",
                    30,
                    LocalDate.of(2012,04,15),
                    "http://www.hbo.com/girls"
            );

            tvShowRepository.saveAll(
                    List.of(show)
            );

        };



    }



}

