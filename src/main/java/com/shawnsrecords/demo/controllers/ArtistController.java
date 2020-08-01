package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.entities.Artist;
import com.shawnsrecords.demo.storage.ArtistStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Random;

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
    @GetMapping ("/api/artists")
    public Collection<Artist> findAllArtists() {
        return artistStorage.findAllArtists();
    }

    @GetMapping ("/api/artists/{id}")
    public Artist findArtistById(@PathVariable long id) {
        return artistStorage.findArtistById(id);
    }

    @GetMapping ("/api/artists/random")
    public Artist findRandomArtist() {
        Random rnd = new Random();
        List<Artist> allArtists = (List<Artist>) artistStorage.findAllArtists();
        return allArtists.get(rnd.nextInt(allArtists.size()));
    }
}
