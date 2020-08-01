import { fetchAllArtists, fetchAllSongs, fetchRandomArtist, fetchRandomAlbum, fetchRandomSong } from "./api-helper.js"
import { renderSingleAlbumView } from "./components/album-view.js"
import { renderAlbumsView } from "./components/albums-view.js"
import { renderSingleArtistView } from "./components/artist-view.js" 
import { renderArtistsView } from "./components/artists-view.js"
import { renderHomepageView } from "./components/homepage-view.js"
import { renderSongsView } from "./components/songs-view.js"

// Header buttons
const headerRecord = document.querySelector(".header__record");
const headerNavArtists = document.querySelector(".header__nav--artists");
const headerNavAlbums = document.querySelector(".header__nav--albums");
const headerNavSongs = document.querySelector(".header__nav--songs");

// Open website
renderHomepageView();

// EventListeners
headerRecord.addEventListener("click", renderHomepageView);
headerNavArtists.addEventListener("click", renderArtistsView);
headerNavAlbums.addEventListener("click", renderAlbumsView);
headerNavSongs.addEventListener("click", renderSongsView);
