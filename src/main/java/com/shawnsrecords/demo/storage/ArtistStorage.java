package com.shawnsrecords.demo.storage;

import com.shawnsrecords.demo.entities.Artist;
import com.shawnsrecords.demo.storage.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
    public Collection<Artist> findAllArtists() {
        return (Collection<Artist>) artistRepo.findAll();
    }

    public Artist findArtistById(long id) {
        return artistRepo.findById(id).get();
    }
}
