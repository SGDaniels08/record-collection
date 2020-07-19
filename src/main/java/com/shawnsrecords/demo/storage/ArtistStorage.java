package com.shawnsrecords.demo.storage;

import com.shawnsrecords.demo.storage.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistStorage {

    // Instance Variables
    private ArtistRepository artistRepo;

    // Constructors
    public ArtistStorage(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

    // Getters
    public ArtistRepository getArtistRepo() {
        return artistRepo;
    }

    // Other methods
}
