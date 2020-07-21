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
    private String imagePath;

    // Constructors
    protected Artist() {}

    public Artist(String artistName, String imagePath) {
        this.artistName = artistName; this.imagePath = imagePath;
    }

    // Getters

    public long getId() {
        return id;
    }
    public String getArtistName() {
        return artistName;
    }
    public Collection<Album> getArtistAlbums() { return artistAlbums; }
    public String getImagePath() { return imagePath; }

    // Other methods
}
