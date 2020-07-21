import { fetchAllArtists } from "../api-helper.js";

const renderArtistsView = () => {
const contentContainer = document.querySelector("main");
contentContainer.classList.add("artists__mainSection");

const artistsTitle = document.createElement("h2");
artistsTitle.classList.add("artists__title");
artistsTitle.innerHTML = "Artists"
contentContainer.appendChild(artistsTitle);

const artistsWrapper = document.createElement("div");
artistsWrapper.classList.add("artists__wrapper");

fetchAllArtists().then((artists)=> {
    
    artists.forEach(artist => {
      console.log(artist);
      const singleArtistSection = document.createElement("figure");
      singleArtistSection.classList.add("artists__singleArtistSection");
      singleArtistSection.innerHTML = `
      <img
      class="artists__singleArtistPicture"
      src="../static/images/artists/${artist.imagePath}"
      alt="Picture of artist / band ${artist.artistName}of Montreal"
      />
      <figcaption class="artists__singleArtistName">${artist.artistName}</figcaption>
      `
    
    artistsWrapper.appendChild(singleArtistSection);
});

contentContainer.appendChild(artistsWrapper);

})};

export { renderArtistsView }