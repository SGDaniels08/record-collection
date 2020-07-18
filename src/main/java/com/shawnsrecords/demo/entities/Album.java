package com.shawnsrecords.demo.entities;

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
    protected Album() {}

    public Album(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
    }

    // Getters

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Artist getArtist() {
        return artist;
    }
    public Collection<Song> getSongs() {
        return songs;
    }

    // Other methods
}
