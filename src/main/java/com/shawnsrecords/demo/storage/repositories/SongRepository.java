package com.shawnsrecords.demo.storage.repositories;

import com.shawnsrecords.demo.entities.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
