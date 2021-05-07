package com.Separion.MovieApi.Movie;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Long id;
    private String title;
    private Integer year;
    private String rated;
//    @JsonFormat(pattern="dd--MM-yyyy")
    private LocalDate released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actor;
    private String plot;
    private String language;
    private String poster;
    private String type;

    public Movie() {
    }

    public Movie(Long id, String title, Integer year, String rated, LocalDate released, String runtime, String genre, String director, String writer, String actor, String plot, String language, String poster, String type) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actor = actor;
        this.plot = plot;
        this.language = language;
        this.poster = poster;
        this.type = type;
    }

    public Movie(String title, Integer year, String rated, LocalDate released, String runtime, String genre, String director, String writer, String actor, String plot, String language, String poster, String type) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actor = actor;
        this.plot = plot;
        this.language = language;
        this.poster = poster;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", released=" + released +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actor='" + actor + '\'' +
                ", plot='" + plot + '\'' +
                ", language='" + language + '\'' +
                ", poster='" + poster + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
