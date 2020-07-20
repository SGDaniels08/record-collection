//package com.shawnsrecords.demo;
//
//import com.shawnsrecords.demo.entities.Album;
//import com.shawnsrecords.demo.entities.Artist;
//import com.shawnsrecords.demo.entities.Song;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class EntityTester {
//
//    @Test
//    public void artistObjectInstantiatesCorrectly() {
//        // Arrangement + Activation
//        Artist testArtist = new Artist("Tom Waits");
//
//        // Assertion
//        assert(testArtist.getName().equals("Tom Waits"));
//    }
//    @Test
//    public void albumObjectInstantiatesCorrectly() {
//        // Arrangement
//        Artist testArtist = new Artist("Tom Waits");
//
//        // Activation
//        Album testAlbum = new Album("Mule Variations", testArtist);
//
//        // Assertion
//        assert(testAlbum.getName().equals("Mule Variations"));
//        assert(testAlbum.getArtist().equals(testArtist));
//    }
//
//    @Test
//    public void songObjectInstantiatesCorrectly() {
//        // Arrangement
//        Artist testArtist = new Artist("Tom Waits");
//        Album testAlbum = new Album("Mule Variations", testArtist);
//
//        // Activation
//        Song testSong = new Song("Chocolate Jesus", testAlbum);
//
//        // Assertion
//        assert(testSong.getName().equals("Chocolate Jesus"));
//        assert(testSong.getAlbum().equals(testAlbum));
//        assert(testSong.getAlbum().getArtist().equals(testArtist));
//    }
//}
