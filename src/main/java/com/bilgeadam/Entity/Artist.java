package com.bilgeadam.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String artistName;
    private String birthDate;
    private String deathDate;  // could be empty, no constructor.
    @OneToMany(cascade = CascadeType.ALL)
    private List<Artifacts> artifactsList;

    public Artist(String artistName, String birthDate, String deathDate) {
        this.artistName = artistName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }
}
