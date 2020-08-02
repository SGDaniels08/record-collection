import { fetchAllSongs, fetchAllArtists, fetchSongAlbum, fetchAlbumArtist } from "../api-helper.js"

const renderSongsView = ()=> {

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

contentContainer.classList.add("songs__mainSection");


const songsTitle = document.createElement("h2");
songsTitle.classList.add("songs__title");
songsTitle.innerHTML = "Songs";
contentContainer.appendChild(songsTitle);

const songsAllSongs = document.createElement("ul");
songsAllSongs.classList.add("songs__allSongs");
contentContainer.appendChild(songsAllSongs);

fetchAllSongs().then((songs)=> {
  // sort songs
  songs.forEach((song)=> {
    fetchSongAlbum(song.id).then((songAlbum)=> {
      fetchAlbumArtist(songAlbum.id).then((songArtist)=> {
    const songsSong = document.createElement("li");
    songsSong.classList.add("songs__song");
    songsSong.innerHTML = `${song.songName} -- on ${songAlbum.albumName}, by ${songArtist.artistName}`;

    songsAllSongs.appendChild(songsSong);
  })
})
})})};

export {renderSongsView}