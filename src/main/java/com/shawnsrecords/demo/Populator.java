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

        /* Artists */
        Artist tomWaits = new Artist("Tom Waits", "tomWaits.jpg");
        Artist yeasayer = new Artist("Yeasayer", "yeasayer.jpg");
        Artist ofMontreal = new Artist("of Montreal", "ofMontreal.jpg");

        artistRepo.save(tomWaits);
        artistRepo.save(yeasayer);
        artistRepo.save(ofMontreal);

        /* Albums */
        // Tom Waits
        Album muleVariations = new Album("Mule Variations", tomWaits, "muleVariations.jpg");
        Album swordfishtrombones = new Album("Swordfishtrombones", tomWaits, "swordfishtrombones.jpg");
        Album realGone = new Album("Real Gone", tomWaits, "realGone.jpg");
        albumRepo.save(muleVariations);
        albumRepo.save(swordfishtrombones);
        albumRepo.save(realGone);

        //Yeasayer
        Album oddBlood = new Album("Odd Blood", yeasayer, "oddBlood.jpg");
        albumRepo.save(oddBlood);

        //of Montreal
        Album hissingFauna = new Album("Hissing Fauna, Are You the Destroyer?", ofMontreal, "hissingFaunaAreYouTheDestroyer.jpg");
        Album aureateGloom = new Album("Aureate Gloom", ofMontreal, "aureateGloom.jpg");
        albumRepo.save(hissingFauna);
        albumRepo.save(aureateGloom);

        /* Songs */

        // Mule Variations
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

        // Real Gone
        Song topOfTheHill = new Song("Top of the Hill", realGone);
        Song hoistThatRag = new Song("Hoist That Rag", realGone);
        Song sinsOfMyFather = new Song("Sins of My Father", realGone);
        Song shakeIt= new Song("Shake It", realGone);
        Song dontGoIntoThatBarn = new Song("Don't Go into That Barn", realGone);
        Song howsItGonnaEnd = new Song("How's It Gonna End", realGone);
        Song metropolitanGlide = new Song("Metropolitan Glide", realGone);
        Song deadAndLovely = new Song("Dead and Lovely", realGone);
        Song circus = new Song("Circus", realGone);
        Song trampledRose = new Song("Trampled Rose", realGone);
        Song greenGrass = new Song("Green Grass", realGone);
        Song babyGonnaLeaveMe = new Song("Baby Gonna Leave Me", realGone);
        Song clangBoomSteam = new Song("Clang Boom Steam", realGone);
        Song makeItRain = new Song("Make It Rain", realGone);
        Song dayAfterTomorrow = new Song("Day After Tomorrow", realGone);
        Song chickABoom = new Song("Chick a Boom (hidden track)", realGone);
        songRepo.save(topOfTheHill);
        songRepo.save(hoistThatRag);
        songRepo.save(sinsOfMyFather);
        songRepo.save(shakeIt);
        songRepo.save(dontGoIntoThatBarn);
        songRepo.save(howsItGonnaEnd);
        songRepo.save(metropolitanGlide);
        songRepo.save(deadAndLovely);
        songRepo.save(circus);
        songRepo.save(trampledRose);
        songRepo.save(greenGrass);
        songRepo.save(babyGonnaLeaveMe);
        songRepo.save(clangBoomSteam);
        songRepo.save(makeItRain);
        songRepo.save(dayAfterTomorrow);
        songRepo.save(chickABoom);

        // Odd Blood
        Song theChildren = new Song("The Children", oddBlood);
        Song amblingAlp = new Song("Ambling Alp", oddBlood);
        Song madderRed = new Song("Madder Red", oddBlood);
        Song iRemember = new Song("I Remember", oddBlood);
        Song oNE = new Song("O.N.E.", oddBlood);
        Song loveMeGirl = new Song("Love Me Girl", oddBlood);
        Song rome = new Song("Rome", oddBlood);
        Song strangeReunions = new Song("Strange Reunions", oddBlood);
        Song mondegreen = new Song("Mondegreen", oddBlood);
        Song grizelda = new Song("Grizelda", oddBlood);
        songRepo.save(theChildren);
        songRepo.save(amblingAlp);
        songRepo.save(madderRed);
        songRepo.save(iRemember);
        songRepo.save(oNE);
        songRepo.save(loveMeGirl);
        songRepo.save(rome);
        songRepo.save(strangeReunions);
        songRepo.save(mondegreen);
        songRepo.save(grizelda);

        // Hissing Fauna, Are You the Destroyer?
        Song sufferForFashion = new Song("Suffer for Fashion", hissingFauna);
        Song sinkTheSeine = new Song("Sink the Seine", hissingFauna);
        Song catoAsAPun = new Song("Cato as a Pun", hissingFauna);
        Song heimdalsgate = new Song("Heimdalsgate like a Promethean Curse", hissingFauna);
        Song gronlandicEdit = new Song("Gronlandic Edit", hissingFauna);
        Song aSentenceOfSorts = new Song("A Sentence of Sorts in Kongsvinger", hissingFauna);
        Song thePastIsAGrotesqueAnimal = new Song("The Past Is a Grotesque Animal", hissingFauna);
        Song bunnyAintNo = new Song("Bunny Ain't No Kind of Rider", hissingFauna);
        Song fabergeFalls = new Song("Faberge Falls for Shuggie", hissingFauna);
        Song labyrinthianPomp = new Song("Labyrinthian Pomp", hissingFauna);
        Song shesARejecter = new Song("She's a Rejecter", hissingFauna);
        Song weWereBorn = new Song("We Were Born the Mutants Again with Leafling", hissingFauna);
        Song duOgMeg = new Song("Du Og Meg", hissingFauna);
        Song voltaic = new Song("Voltaic Crusherundrum to Muted Da", hissingFauna);
        Song derailments = new Song("Derailments in a Place of Our Own", hissingFauna);
        Song noConclusion = new Song("No Conclusion", hissingFauna);
        songRepo.save(sufferForFashion);
        songRepo.save(sinkTheSeine);
        songRepo.save(catoAsAPun);
        songRepo.save(heimdalsgate);
        songRepo.save(gronlandicEdit);
        songRepo.save(aSentenceOfSorts);
        songRepo.save(thePastIsAGrotesqueAnimal);
        songRepo.save(bunnyAintNo);
        songRepo.save(fabergeFalls);
        songRepo.save(labyrinthianPomp);
        songRepo.save(shesARejecter);
        songRepo.save(weWereBorn);
        songRepo.save(duOgMeg);
        songRepo.save(voltaic);
        songRepo.save(derailments);
        songRepo.save(noConclusion);
    }
}
