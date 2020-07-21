const renderAlbumsView = ()=> {

const contentContainer = document.querySelector("main");
contentContainer.classList.add("albums__mainSection");

contentContainer.innerHTML = `
<h2 class="albums__title">Albums</h2>

      <section class="albums__singleArtistSection">
        <h3>Tom Waits</h3>
        <div class="albums__singleArtistAlbums">
          <figure class="albums__singleAlbumSection">
            <img
              class="albums__singleAlbumPicture"
              src="../static/images/albums/muleVariations.jpg"
              alt="Cover art for Mule Variations, an album by Tom Waits"
            />
            <figcaption class="albums__singleAlbumName">
              Mule Variations
            </figcaption>
          </figure>

          <figure class="albums__singleAlbumSection">
            <img
              class="albums__singleAlbumPicture"
              src="../static/images/albums/swordfishtrombones.jpg"
              alt="Covert art for Swordfishtrombones, an album by Tom Waits"
            />
            <figcaption class="albums__singleAlbumName">
              Swordfishtrombones
            </figcaption>
          </figure>
        </div>
      </section>

      <section class="albums__singleArtistSection">
        <h3>of Montreal</h3>
        <div class="albums__singleArtistAlbums">
          <figure class="albums__singleAlbumSection">
            <img
              class="albums__singleAlbumPicture"
              src="../static/images/albums/hissingFaunaAreYouTheDestroyer.jpg"
              alt="Cover art for Hissing Fauna, Are You the Destroyer?, an album by of Montreal"
            />
            <figcaption class="albums__singleAlbumName">
              Hissing Fauna, Are You the Destroyer?
            </figcaption>
          </figure>
        </div>
      </section>
`
}

export {renderAlbumsView}