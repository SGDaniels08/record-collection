package com.shawnsrecords.demo.storage.repositories;

import com.shawnsrecords.demo.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
