package com.Separion.MovieApi.TvShow;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    private Integer runtime;

    private String officialSite;


    public TvShow() {
    }

    public TvShow(Long id, String url, String name, String type, String language, String status, Integer runtime, String officialSite) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.status = status;
        this.runtime = runtime;
        this.officialSite = officialSite;

    }

    public TvShow(String url, String name, String type, String language, String status, Integer runtime, String officialSite) {
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.status = status;
        this.runtime = runtime;

        this.officialSite = officialSite;

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

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }


    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
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
                ", officialSite='" + officialSite + '\'' +

                '}';
    }
}
