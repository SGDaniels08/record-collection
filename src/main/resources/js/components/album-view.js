const renderSingleAlbumView = () => {

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

contentContainer.innerHTML = `
<figure class="singleAlbum__figure">
        <h2 class="singleAlbum__title">Mule Variations</h2>
        <img
          class="singleAlbum__picture"
          src="../static/images/albums/muleVariations.jpg"
          alt="Cover art for Mule Variations, an album by Tom Waits"
        />
        <figcaption class="singleAlbum__artistName">by Tom Waits</figcaption>
      </figure>

      <ol class="singleAlbum__songlist">
        <li class="singleAlbum__song">Big in Japan</li>
        <li class="singleAlbum__song">Low Side of the Road</li>
        <li class="singleAlbum__song">Hold On</li>
        <li class="singleAlbum__song">Get Behind the Mule</li>
        <li class="singleAlbum__song">House Where Nobody Lives</li>
        <li class="singleAlbum__song">Cold Water</li>
        <li class="singleAlbum__song">Pony</li>
        <li class="singleAlbum__song">What's He Building?</li>
        <li class="singleAlbum__song">Black Market Baby</li>
        <li class="singleAlbum__song">Eyeball Kid</li>
        <li class="singleAlbum__song">Picture in a Frame</li>
        <li class="singleAlbum__song">Chocolate Jesus</li>
        <li class="singleAlbum__song">Georgia Lee</li>
        <li class="singleAlbum__song">Filipino Box Spring Hog</li>
        <li class="singleAlbum__song">Take It with Me</li>
        <li class="singleAlbum__song">Come on up to the House</li>
      </ol>
`
}

export {renderSingleAlbumView}