import { fetchSingleAlbum, fetchAlbumArtist } from "../api-helper.js";

const renderSingleAlbumView = (albumId) => {

const contentContainer = document.querySelector(".content__container");

//Clear main
contentContainer.classList.remove(
  "singleAlbumSection",
  "albums__mainSection",
  "singleArtistSection",
  "artists__mainSection",
  "songs__mainSection",
  "homepage__mainSection"
);while (contentContainer.firstChild) {
  contentContainer.firstChild.remove();
}
contentContainer.classList.add("singleAlbumSection");

fetchSingleAlbum(albumId).then((album)=> {
  fetchAlbumArtist(album.id).then((albumArtist)=> {

const singleAlbumFigure = document.createElement("figure");
singleAlbumFigure.classList.add("singleAlbum__figure");
singleAlbumFigure.innerHTML = `
<figure class="singleAlbum__figure">
        <h2 class="singleAlbum__title">${album.albumName}</h2>
        <img
          class="singleAlbum__picture"
          src="../static/images/albums/${album.imagePath}"
          alt="Cover art for ${album.albumName}, an album by ${albumArtist.artistName}"
        />
        <figcaption class="singleAlbum__artistName">by ${albumArtist.artistName}</figcaption>
      </figure>
`

const singleAlbumSonglist = document.createElement("ol");
singleAlbumSonglist.classList.add("singleAlbum__songlist");

album.albumSongs.forEach(song => {
  const singleAlbumSong = document.createElement("li")
  singleAlbumSong.classList.add("singleAlbum__song");
  singleAlbumSong.innerHTML = `${song.songName}`
  
  singleAlbumSonglist.appendChild(singleAlbumSong);  
})
contentContainer.appendChild(singleAlbumFigure);
contentContainer.appendChild(singleAlbumSonglist);
})})}

export {renderSingleAlbumView}