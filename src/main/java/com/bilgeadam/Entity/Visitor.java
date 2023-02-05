package com.bilgeadam.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String visitorName;
    private int visitorAge;
    private double phone;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Exhibition> exhibitionList;
}
