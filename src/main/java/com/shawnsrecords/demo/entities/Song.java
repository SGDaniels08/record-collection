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
    private String name;
    @JsonIgnore
    @ManyToOne
    private Album album;

    // Constructors
    protected Song() {}

    public Song(String name, Album album) {
        this.name = name;
        this.album = album;
    }

    // Getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Album getAlbum() {
        return album;
    }

    // Other methods
}
