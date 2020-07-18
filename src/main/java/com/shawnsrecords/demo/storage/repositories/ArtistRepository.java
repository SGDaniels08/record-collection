package com.shawnsrecords.demo.storage.repositories;

import com.shawnsrecords.demo.entities.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
