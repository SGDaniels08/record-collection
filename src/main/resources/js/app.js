import { fetchAllArtists, fetchAllSongs, fetchRandomArtist, fetchRandomAlbum, fetchRandomSong } from "./api-helper.js"
import { renderSingleAlbumView } from "./components/album-view.js"
import { renderAlbumsView } from "./components/albums-view.js"
import { renderSingleArtistView } from "./components/artist-view.js" 
import { renderArtistsView } from "./components/artists-view.js"
import { renderHomepageView } from "./components/homepage-view.js"
import { renderSongsView } from "./components/songs-view.js"


renderHomepageView();