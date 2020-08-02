import { fetchAllArtists } from "../api-helper.js";

const renderAlbumsView = ()=> {

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

contentContainer.classList.add("albums__mainSection");


const albumsTitle = document.createElement("h2");
albumsTitle.classList.add("albums__title");
contentContainer.appendChild(albumsTitle);

fetchAllArtists().then((artists)=> {
  artists.forEach(artist => {
    

const singleArtistSection = document.createElement("section");
singleArtistSection.classList.add("albums__singleArtistSection");

const singleArtistName = document.createElement("h3");
singleArtistName.innerHTML = `${artist.artistName}`;
singleArtistSection.appendChild(singleArtistName);

const singleArtistAlbums = document.createElement("div");
singleArtistAlbums.classList.add("albums__singleArtistAlbums");


(artist.artistAlbums).forEach((album)=> {
  const singleAlbum = document.createElement("figure");
  singleAlbum.classList.add("albums__singleAlbumSection");
  singleAlbum.innerHTML = `
               <img
               class="albums__singleAlbumPicture"
               src="../static/images/albums/${album.imagePath}"
               alt="Cover art for ${album.albumName}, an album by ${artist.artistName}"
               />
               <figcaption class="albums__singleAlbumName">
               ${album.albumName}
               </figcaption>
`
singleArtistAlbums.append(singleAlbum)
})
singleArtistSection.appendChild(singleArtistAlbums);
contentContainer.appendChild(singleArtistSection);

// // For each album 
// singleArtistAlbums.appendChild(`

//           <figure class="albums__singleAlbumSection">
//             <img
//               class="albums__singleAlbumPicture"
//               src="../static/images/albums/${album.imagePath}"
//               alt="Cover art for ${album.albumName}, an album by ${artist.artistName}"
//             />
//             <figcaption class="albums__singleAlbumName">
//               ${album.albumName}
//             </figcaption>
//           </figure>

// `)
})})}

export {renderAlbumsView}