package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.entities.Album;
import com.shawnsrecords.demo.storage.AlbumStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AlbumController {

    // Instance Variables
    private AlbumStorage albumStorage;

    // Constructor
    public AlbumController(AlbumStorage albumStorage) {
        this.albumStorage = albumStorage;
    }

    // Getters
    public AlbumStorage getAlbumStorage() {
        return albumStorage;
    }

    // Mapping Methods
    @GetMapping("/api/albums")
    public Collection<Album> findAllAlbums() {
        return albumStorage.findAllAlbums();
    }
}
