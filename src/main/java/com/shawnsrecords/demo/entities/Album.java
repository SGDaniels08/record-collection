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

    // Constructors
    protected Album() {}

    public Album(String albumName, Artist albumArtist) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;
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

    // Other methods

}
