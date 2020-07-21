import { fetchAllArtists } from "../api-helper.js";

const renderArtistsView = () => {
const contentContainer = document.querySelector("main");
contentContainer.classList.add("artists__mainSection");

contentContainer.innerHTML = `
<h2 class="artists__title">Artists</h2>
<div class="artists__wrapper">
`
fetchAllArtists().then((artists)=> {
    
    artists.forEach(artist => {
      console.log(artist);
      let singleArtistSection = document.createElement("figure");
      singleArtistSection.classList.add="artists__singleArtistSection";
      singleArtistSection.innerHTML = `
      <a href="singleartistpage">
      <img
      class="artists__singleArtistPicture"
      src="../static/images/artists/${artist.imagePath}"
      alt="Picture of artist / band ${artist.artistName}of Montreal"
      />
      <figcaption class="artists__singleArtistName">${artist.artistName}</figcaption>
      </a>
      `
    
    contentContainer.appendChild(singleArtistSection);
});

contentContainer.appendChild("</div>");
})};

export { renderArtistsView }