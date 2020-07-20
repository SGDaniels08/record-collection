package com.shawnsrecords.demo.storage;

import com.shawnsrecords.demo.entities.Album;
import com.shawnsrecords.demo.storage.repositories.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlbumStorage {

    // Instance Variables
    private AlbumRepository albumRepo;

    // Constructors
    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

    // Getters
    public AlbumRepository getAlbumRepo() {
        return albumRepo;
    }

    // Other methods
    public Collection<Album> findAllAlbums() {
        return (Collection<Album>) albumRepo.findAll();
    }
}
