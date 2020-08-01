import { fetchRandomArtist, fetchRandomAlbum, fetchRandomSong } from "../api-helper.js";

const renderHomepageView = () => {
const contentContainer = document.querySelector("main");
contentContainer.classList.add("homepage__mainSection");

/*** Random Artist ***/
const randomArtist = document.createElement("section");
randomArtist.classList.add("homepageArtist");

fetchRandomArtist().then((artist)=> {
  randomArtist.innerHTML = `
  <h3 class="homepageartist__title">Artists</h3>
    <figure class="homepageartist__figure">
      <img
        class="homepageartist__picture"
        src="/src/main/resources/static/images/artists/${artist.imagePath}"
        alt="Picture of artist / band ${artist.artistName}"
      />
      <figcaption class="homepageartist__name">
        ${artist.artistName}
      </figcaption>
    </figure>
  `
  contentContainer.append(randomArtist);  
})

/*** Random Album ***/
const randomAlbum = document.createElement("section");
randomAlbum.classList.add("homepageAlbum");

fetchRandomAlbum().then((album)=> {
  randomAlbum.innerHTML = `
  <h3 class="homepagealbum__title">Albums</h3>
  <figure class="homepagealbum__figure">
    <img
      class="homepagealbum__picture"
      src="/src/main/resources/static/images/albums/${album.imagePath}"
      alt="Picture of the album ${album.albumName}, by --ARTIST--"
    />
    <figcaption class="homepagealbum__name">
      ${album.albumName}<br />
      by --ARTIST--
    </figcaption>
  </figure>  
  `
  contentContainer.append(randomAlbum);
})

/*** Random Song ***/
const randomSong = document.createElement("section");
randomSong.classList.add("homepageSong");

fetchRandomSong().then((song)=> {
  randomSong.innerHTML = `
  <h3 class="homepagesong__title">Songs</h3>
  <figure class="homepagesong__figure">
    <img
      class="homepagesong__picture"
      src="/src/main/resources/static/images/albums/hissingFaunaAreYouTheDestroyer.jpg"
      alt="Picture of --ALBUM--, the album by --ARTIST-- that contains ${song.songName}"
    />
    <figcaption class="homepagesong__name">
      ${song.songName}<br />
      on --ALBUM--?<br />
      by --ARTIST--
    </figcaption>
  </figure>
  `
  contentContainer.append(randomSong);
})}

export {renderHomepageView}