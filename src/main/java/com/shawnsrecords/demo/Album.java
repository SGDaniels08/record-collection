package com.shawnsrecords.demo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Album {

    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String name;
    @ManyToOne
    private Artist artist;
    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;
    // Constructors

    // Getters

    // Other methods
}
