import { fetchAllArtists } from "./api-helper.js"
import { renderHomepage } from "./components/homepage-view.js"
import { renderArtistsView } from "./components/artists-view.js"
console.log(fetchAllArtists());

renderArtistsView();

