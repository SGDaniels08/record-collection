import { fetchAllSongs, fetchAllArtists } from "../api-helper.js"

const renderSongsView = ()=> {

const contentContainer = document.querySelector("main");

//Clear main
contentContainer.classList.remove();
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
    const songsSong = document.createElement("li");
    songsSong.classList.add("songs__song");
    songsSong.innerHTML = `${song.songName} -- `;

    songsAllSongs.appendChild(songsSong);
  })
});
}

export {renderSongsView}