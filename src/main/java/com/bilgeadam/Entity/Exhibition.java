package com.bilgeadam.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Exhibition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String exhibitionName;
    private String openingDate;
    private String closingDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Museum museum;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Artifacts> artifactsList;

    public Exhibition(String exhibitionName, String openingDate, String closingDate, Museum museum, List<Artifacts> artifactsList) {
        this.exhibitionName = exhibitionName;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.museum = museum;
        this.artifactsList = artifactsList;
    }

    public Exhibition(String exhibitionName, String openingDate, String closingDate, List<Artifacts> artifactsList) {
        this.exhibitionName = exhibitionName;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.artifactsList = artifactsList;
    }
}
