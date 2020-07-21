import { fetchAllArtists } from "./api-helper.js"
import { renderHomepage } from "./components/homepage-view.js"
console.log(fetchAllArtists());

renderHomepage();

