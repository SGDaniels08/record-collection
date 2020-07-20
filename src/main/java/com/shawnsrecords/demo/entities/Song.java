package com.shawnsrecords.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {

    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String songName;
    @JsonIgnore
    @ManyToOne
    private Album songAlbum;

    // Constructors
    protected Song() {}

    public Song(String songName, Album songAlbum) {
        this.songName = songName;
        this.songAlbum = songAlbum;
    }

    // Getters
    public long getId() {
        return id;
    }
    public String getSongName() {
        return songName;
    }
    public Album getSongAlbum() {
        return songAlbum;
    }

    // Other methods
}
