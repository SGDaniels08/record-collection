const renderHomepage = () => {
const contentContainer = document.querySelector("main");
contentContainer.classList.add("homepage__mainSection");
contentContainer.innerHTML = `
<section class="homepageartist">
  <h3 class="homepageartist__title">Artists</h3>
  <figure class="homepageartist__figure">
    <img
      class="homepageartist__picture"
      src="/src/main/resources/static/images/artists/florence+TheMachine.jpg"
      alt="Picture of artist / band Florence + the Machine"
    />
    <figcaption class="homepageartist__name">
      Florence + the Machine
    </figcaption>
  </figure>
</section>
<section class="homepagealbum">
  <h3 class="homepagealbum__title">Albums</h3>
  <figure class="homepagealbum__figure">
    <img
      class="homepagealbum__picture"
      src="/src/main/resources/static/images/albums/muleVariations.jpg"
      alt="Picture of the album Mule Variations, by Tom Waits"
    />
    <figcaption class="homepagealbum__name">
      Mule Variations<br />
      by Tom Waits
    </figcaption>
  </figure>
</section>
<section class="homepagesong">
  <h3 class="homepagesong__title">Songs</h3>
  <figure class="homepagesong__figure">
    <img
      class="homepagesong__picture"
      src="/src/main/resources/static/images/albums/hissingFaunaAreYouTheDestroyer.jpg"
      alt="Picture of Hissing Fauna, Are You the Destroyer?, the album by of Montreal that contains Heimdalsgate Like a Promethean Curse"
    />
    <figcaption class="homepagesong__name">
      Heimdalsgate like a Promethean Curse<br />
      on Hissing Fauna, Are You the Destroyer?<br />
      by of Montreal
    </figcaption>
  </figure>
</section>
`
}

export {renderHomepage}