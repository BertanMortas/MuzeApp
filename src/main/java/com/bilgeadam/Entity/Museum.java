package com.bilgeadam.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Museum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String museumName;
    private String location;
    private String openingTime;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Exhibition> exhibitionList;

    public Museum(String museumName, String location, String openingTime) {
        this.museumName = museumName;
        this.location = location;
        this.openingTime = openingTime;
    }

    public Museum(String museumName, String location, String openingTime, List<Exhibition> exhibitionList) {
        this.museumName = museumName;
        this.location = location;
        this.openingTime = openingTime;
        this.exhibitionList = exhibitionList;
    }
}
