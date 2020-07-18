package com.shawnsrecords.demo;

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
    @ManyToOne
    private Album album;

    // Constructors
    protected Song() {}

    public Song(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Other methods
}
