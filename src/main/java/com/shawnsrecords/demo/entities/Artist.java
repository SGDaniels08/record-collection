package com.shawnsrecords.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {

    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String name;
    @OneToMany(mappedBy = "artist")
    private Collection<Album> albums;

    // Constructors
    protected Artist() {}

    public Artist(String name) {
        this.name = name;
    }

    // Getters

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Collection<Album> getAlbums() {
        return albums;
    }


    // Other methods
}
