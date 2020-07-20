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
    private String artistName;
    @OneToMany(mappedBy = "albumArtist")
    private Collection<Album> artistAlbums;

    // Constructors
    protected Artist() {}

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    // Getters

    public long getId() {
        return id;
    }
    public String getArtistName() {
        return artistName;
    }
    public Collection<Album> getArtistAlbums() { return artistAlbums; }

    // Other methods
}
