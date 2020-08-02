import {
  fetchRandomArtist,
  fetchRandomAlbum,
  fetchRandomSong,
  fetchAlbumArtist,
  fetchSongAlbum,
} from "../api-helper.js";

const renderHomepageView = () => {
  const contentContainer = document.querySelector(".content__container");

  //Clear main
  contentContainer.classList.remove(
    "singleAlbumSection",
    "albums__mainSection",
    "singleArtistSection",
    "artists__mainSection",
    "songs__mainSection",
    "homepage__mainSection"
  );
  while (contentContainer.firstChild) {
    contentContainer.firstChild.remove();
  }

  contentContainer.classList.add("homepage__mainSection");

  /*** Random Artist ***/
  const randomArtist = document.createElement("section");
  randomArtist.classList.add("homepageArtist");

  fetchRandomArtist().then((artist) => {
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
  `;
  });

  /*** Random Album ***/
  const randomAlbum = document.createElement("section");
  randomAlbum.classList.add("homepageAlbum");
  
  fetchRandomAlbum().then((album) => {
    fetchAlbumArtist(album.id).then((albumArtist)=> {;
    console.log(albumArtist);
    randomAlbum.innerHTML = `
  <h3 class="homepagealbum__title">Albums</h3>
  <figure class="homepagealbum__figure">
    <img
      class="homepagealbum__picture"
      src="/src/main/resources/static/images/albums/${album.imagePath}"
      alt="Picture of the album ${album.albumName}, by ${albumArtist.artistName}"
    />
    <figcaption class="homepagealbum__name">
      ${album.albumName}<br />
      by ${albumArtist.artistName}
    </figcaption>
  </figure>  
  `;
  })});

  /*** Random Song ***/
  const randomSong = document.createElement("section");
  randomSong.classList.add("homepageSong");

  fetchRandomSong().then((song) => {
    fetchSongAlbum(song.id).then((songAlbum) => {
      fetchAlbumArtist(songAlbum.id).then((songArtist) => {
    randomSong.innerHTML = `
  <h3 class="homepagesong__title">Songs</h3>
  <figure class="homepagesong__figure">
    <img
      class="homepagesong__picture"
      src="/src/main/resources/static/images/albums/${songAlbum.imagePath}"
      alt="Picture of ${songAlbum.albumName}, the album by ${songArtist.artistName} that contains ${song.songName}"
    />
    <figcaption class="homepagesong__name">
      ${song.songName}<br />
      on ${songAlbum.albumName}<br />
      by ${songArtist.artistName}
    </figcaption>
  </figure>
  `;
  });
  contentContainer.append(randomArtist);
  contentContainer.append(randomAlbum);
  contentContainer.append(randomSong);
})})};

export { renderHomepageView };
