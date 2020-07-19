package com.shawnsrecords.demo;

import com.shawnsrecords.demo.entities.Album;
import com.shawnsrecords.demo.entities.Artist;
import com.shawnsrecords.demo.entities.Song;
import com.shawnsrecords.demo.storage.repositories.AlbumRepository;
import com.shawnsrecords.demo.storage.repositories.ArtistRepository;
import com.shawnsrecords.demo.storage.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    ArtistRepository artistRepo;
    @Autowired
    AlbumRepository albumRepo;
    @Autowired
    SongRepository songRepo;

    @Override
    public void run(String... args) throws Exception {

        // Artists
        Artist tomWaits = new Artist("Tom Waits");
        artistRepo.save(tomWaits);

        // Albums
        Album muleVariations = new Album("Mule Variations", tomWaits);
        Album swordfishtrombones = new Album("Swordfishtrombones", tomWaits);
        Album realGone = new Album("Real Gone", tomWaits);

        albumRepo.save(muleVariations);
        albumRepo.save(swordfishtrombones);
        albumRepo.save(realGone);

        // Songs
        Song bigInJapan = new Song("Big in Japan", muleVariations);
        Song lowsideOfTheRoad = new Song("Lowside of the Road", muleVariations);
        Song holdOn = new Song("Hold On", muleVariations);
        Song getBehindTheMule = new Song("Get Behind the Mule", muleVariations);
        Song houseWhereNobodyLives = new Song("House Where Nobody Lives", muleVariations);
        Song coldWater = new Song("Cold Water", muleVariations);
        Song pony = new Song("Pony", muleVariations);
        Song whatsHeBuilding = new Song("What's He Building?", muleVariations);
        Song blackMarketBaby = new Song("Black Market Baby", muleVariations);
        Song eyeballKid = new Song("Eyeball Kid", muleVariations);
        Song pictureInAFrame = new Song("Picture in a Frame", muleVariations);
        Song chocolateJesus = new Song("ChocolateJesus", muleVariations);
        Song georgiaLee = new Song("Georgia Lee", muleVariations);
        Song filipinoBoxSpringHog = new Song("Filipino Box Spring Hog", muleVariations);
        Song takeItWithMe = new Song("Take It with Me", muleVariations);
        Song comeOnUpToTheHouse = new Song("Come on up to the House", muleVariations);

        songRepo.save(bigInJapan);
        songRepo.save(lowsideOfTheRoad);
        songRepo.save(holdOn);
        songRepo.save(getBehindTheMule);
        songRepo.save(houseWhereNobodyLives);
        songRepo.save(coldWater);
        songRepo.save(pony);
        songRepo.save(whatsHeBuilding);
        songRepo.save(blackMarketBaby);
        songRepo.save(eyeballKid);
        songRepo.save(pictureInAFrame);
        songRepo.save(chocolateJesus);
        songRepo.save(georgiaLee);
        songRepo.save(filipinoBoxSpringHog);
        songRepo.save(takeItWithMe);
        songRepo.save(comeOnUpToTheHouse);
    }
}
