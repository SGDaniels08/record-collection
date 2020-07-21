const renderArtistsView = () => {

const contentContainer = document.querySelector("main");
contentContainer.classList.add("artists__mainSection");

contentContainer.innerHTML = `
<h2 class="artists__title">Artists</h2>
<div class="artists__wrapper">
<figure class="artists__singleArtistSection">
  <img
    class="artists__singleArtistPicture"
    src="../static/images/artists/ofMontreal.jpg"
    alt="Picture of artist / band of Montreal"
  />
  <figcaption class="artists__singleArtistName">of Montreal</figcaption>
</figure>
<figure class="artists__singleArtistSection"><a href="artist.html">
  <img
    class="artists__singleArtistPicture"
    src="../static/images/artists/tomWaits.jpg"
    alt="Picture of artist / band Tom Waits"
  />
  <figcaption class="artists__singleArtistName">Tom Waits</figcaption>
</a></figure>
<figure class="artists__singleArtistSection">
  <img
    class="artists__singleArtistPicture"
    src="../static/images/artists/florence+TheMachine.jpg"
    alt="Picture of artist / band Florence + the Machine"
  />
  <figcaption class="artists__singleArtistName">
    Florence + the Machine
  </figcaption>
</figure>
<figure class="artists__singleArtistSection">
  <img
    class="artists__singleArtistPicture"
    src="../static/images/artists/spoon.jpg"
    alt="Picture of artist / band Spoon"
  />
  <figcaption class="artists__singleArtistName">Spoon</figcaption>
</figure>
<figure class="artists__singleArtistSection">
  <img
    class="artists__singleArtistPicture"
    src="../static/images/artists/stVincent.png"
    alt="Picture of artist / band St. Vincent"
  />
  <figcaption class="artists__singleArtistName">St. Vincent</figcaption>
</figure>
</div>
`
}

export { renderArtistsView }