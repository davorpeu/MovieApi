package com.Separion.MovieApi.TvShow;

import com.Separion.MovieApi.Movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/tvshows")


public class TvShowController {

    private final TvShowService tvShowService;

    @Autowired
    public TvShowController(TvShowService tvShowService) {
        this.tvShowService = tvShowService;
    }

    @GetMapping
    public List<TvShow> getTvShows(){
        return tvShowService.getTvShows();
    }

    @PostMapping
    public void addNewTvShow(@RequestBody TvShow tvShow){
        tvShowService.addNewTvShow(tvShow);
    }
}
