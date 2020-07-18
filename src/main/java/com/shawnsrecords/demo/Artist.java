package com.shawnsrecords.demo;

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

    // Getters

    // Other methods
}
