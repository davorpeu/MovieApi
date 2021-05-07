package com.Separion.MovieApi.TvShow;

import com.Separion.MovieApi.Movie.Movie;
import com.Separion.MovieApi.Movie.MovieRepository;
import com.Separion.MovieApi.TvShow.TvShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowService {

    private final TvShowRepository tvshowRepository;

    @Autowired
    public TvShowService(TvShowRepository tvshowRepository) {
        this.tvshowRepository = tvshowRepository;
    }


    public List<TvShow> getTvShows(){
        return tvshowRepository.findAll(


        );
    }
}



