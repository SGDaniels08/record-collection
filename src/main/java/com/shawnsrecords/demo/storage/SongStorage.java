package com.shawnsrecords.demo.storage;

import com.shawnsrecords.demo.storage.repositories.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongStorage {

    // Instance Variables
    private SongRepository songRepo;

    // Constructors
    public SongStorage(SongRepository songRepo) {
        this.songRepo = songRepo;
    }

    // Getters
    public SongRepository getSongRepo() {
        return songRepo;
    }

    // Other methods
}
