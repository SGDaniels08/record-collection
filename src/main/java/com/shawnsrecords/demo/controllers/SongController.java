package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.entities.Song;
import com.shawnsrecords.demo.storage.SongStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SongController {

    // Instance Variables
    private SongStorage songStorage;

    // Constructor
    public SongController(SongStorage songStorage) {
        this.songStorage = songStorage;
    }

    // Getters
    public SongStorage getSongStorage() {
        return songStorage;
    }
    
    // Mapping Methods
    @GetMapping("/api/songs")
    public Collection<Song> findAllSongs() {
        return songStorage.findAllSongs();
    }

    @GetMapping("/api/songs/{id}")
    public Song findSongById(@PathVariable long id) {
        return songStorage.findSongById(id);
    }
}
