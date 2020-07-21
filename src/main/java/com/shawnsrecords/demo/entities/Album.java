package com.shawnsrecords.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Album {

    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String albumName;
    @JsonIgnore
    @ManyToOne
    private Artist albumArtist;
    @OneToMany(mappedBy = "songAlbum")
    private Collection<Song> albumSongs;
    private String imagePath;

    // Constructors
    protected Album() {}

    public Album(String albumName, Artist albumArtist, String imagePath) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.imagePath = imagePath;
    }

    // Getters

    public long getId() {
        return id;
    }
    public String getAlbumName() {
        return albumName;
    }
    public Artist getAlbumArtist() {
        return albumArtist;
    }
    public Collection<Song> getAlbumSongs() { return albumSongs; }
    public String getImagePath() { return imagePath; }

    // Other methods

}
