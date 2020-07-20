package com.shawnsrecords.demo.storage;

import com.shawnsrecords.demo.entities.Song;
import com.shawnsrecords.demo.storage.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

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

    public Collection<Song> findAllSongs() {
        return (Collection<Song>) songRepo.findAll();
    }

    public Song findSongById(long id) {
        return songRepo.findById(id).get();
    }

    // Other methods
}
