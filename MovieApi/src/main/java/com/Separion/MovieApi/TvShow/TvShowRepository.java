package com.Separion.MovieApi.TvShow;

import com.Separion.MovieApi.Movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    @Query("SELECT t From TvShow t WHERE t.name =  ?1")
    Optional<TvShow> findTvShowByName(String name);
}
