package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.storage.ArtistStorage;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    // Instance Variables
    private ArtistStorage artistStorage;

    // Constructor
    public ArtistController(ArtistStorage artistStorage) {
        this.artistStorage = artistStorage;
    }

    // Getters
    public ArtistStorage getArtistStorage() {
        return artistStorage;
    }

    // Mapping Methods
}
