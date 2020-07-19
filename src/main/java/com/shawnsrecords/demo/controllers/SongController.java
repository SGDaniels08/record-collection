package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.storage.SongStorage;
import org.springframework.web.bind.annotation.RestController;

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
}
