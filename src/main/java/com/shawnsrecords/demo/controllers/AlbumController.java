package com.shawnsrecords.demo.controllers;

import com.shawnsrecords.demo.entities.Album;
import com.shawnsrecords.demo.entities.Artist;
import com.shawnsrecords.demo.storage.AlbumStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Random;

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

    @GetMapping("/api/albums/{id}")
    public Album findAlbumById(@PathVariable long id) {
        return albumStorage.findAlbumById(id);
    }

    @GetMapping("/api/albums/random")
    public Album findRandomAlbum() {
        Random rnd = new Random();
        List<Album> allAlbums = (List<Album>) albumStorage.findAllAlbums();
        return allAlbums.get(rnd.nextInt(allAlbums.size()));
    }

    @GetMapping("/api/albums/{id}/artist")
    public Artist findAlbumArtist(@PathVariable long id) {
        return albumStorage.findAlbumById(id).getAlbumArtist();
    }
}
