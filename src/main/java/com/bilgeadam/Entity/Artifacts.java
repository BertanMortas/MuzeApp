package com.bilgeadam.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Artifacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String artifactName;
    private String madeYear;
    @ManyToOne(cascade = CascadeType.ALL)
    private Artist artist;
    @ManyToOne(cascade = CascadeType.ALL)
    private Exhibition exhibition;

    public Artifacts(String artifactName, String madeYear, Artist artist) {
        this.artifactName = artifactName;
        this.madeYear = madeYear;
        this.artist = artist;
    }

    public Artifacts(String artifactName, String madeYear, Artist artist, Exhibition exhibition) {
        this.artifactName = artifactName;
        this.madeYear = madeYear;
        this.artist = artist;
        this.exhibition = exhibition;
    }
}
