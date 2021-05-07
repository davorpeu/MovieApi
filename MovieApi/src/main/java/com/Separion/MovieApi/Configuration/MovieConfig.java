package com.Separion.MovieApi.Configuration;

import com.Separion.MovieApi.Movie.Movie;
import com.Separion.MovieApi.Movie.MovieRepository;
import com.Separion.MovieApi.TvShow.TvShowRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.time.Month;
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
                    LocalDate.of(2002, Month.JANUARY,02),
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
//            Movie sands = new Movie(
//                    "Sand",
//                    2000,
//                    "R",
//                    LocalDate.of(02, Month.JANUARY,2002),
//                    "89 min",
//                    "Drama",
//                    "Matt Palmieri",
//                    "Matt Palmieri",
//                    "Michael Vartan, Norman Reedus, Kari Wuhrer, Marshall Bell",
//                    "A young man tries running from his past by hiding from his two violent brothers, only to have them track and harass him and his friends.",
//                    "English",
//                    "https:\\/\\/m.media-amazon.com\\/images\\/M\\/MV5BMjUxNjU2MzgxM15BMl5BanBnXkFtZTcwNDAxMTkxMQ@@._V1_SX300.jpg",
//                    "movie"
//            );
            movieRepository.saveAll(
                    List.of(sand)
            );
        } ;


    }

//    @Bean
//    CommandLineRunner commandLineRunner(TvShowRepository tvshowRepository){
//        return  args -> {
//
//        } ;

//        tvshowRepository.saveAll(
//                List;
//        );
//    }
//}
}
