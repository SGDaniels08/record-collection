package com.shawnsrecords.demo.entities;

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
    private String name;
    private String duration;
    @ManyToOne
    private Album album;

    // Constructors
    protected Song() {}

    public Song(String name, Album album) {
        this.name = name;
        this.duration = duration;
        this.album = album;
    }

    // Getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDuration() {
        return duration;
    }
    public Album getAlbum() {
        return album;
    }

    // Other methods
}
