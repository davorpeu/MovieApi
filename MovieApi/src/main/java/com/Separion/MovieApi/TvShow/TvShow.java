package com.Separion.MovieApi.TvShow;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class TvShow {
    @Id
    @SequenceGenerator(
            name = "tvshow_sequence",
            sequenceName = "tvshow_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tvshow_sequence"
    )
    private Long id;
    private String url;
    private String name;
    private String type;
    private String language;
    private String status;
    private String runtime;
    private LocalDate premiered;
    private String officialSite;
    private LocalDate schedule;

    public TvShow() {
    }

    public TvShow(Long id, String url, String name, String type, String language, String status, String runtime, LocalDate premiered, String officialSite, LocalDate schedule) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.status = status;
        this.runtime = runtime;
        this.premiered = premiered;
        this.officialSite = officialSite;
        this.schedule = schedule;
    }

    public TvShow(String url, String name, String type, String language, String status, String runtime, LocalDate premiered, String officialSite, LocalDate schedule) {
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.status = status;
        this.runtime = runtime;
        this.premiered = premiered;
        this.officialSite = officialSite;
        this.schedule = schedule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public LocalDate getPremiered() {
        return premiered;
    }

    public void setPremiered(LocalDate premiered) {
        this.premiered = premiered;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public LocalDate getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDate schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "TvShow{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", status='" + status + '\'' +
                ", runtime='" + runtime + '\'' +
                ", premiered=" + premiered +
                ", officialSite='" + officialSite + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
