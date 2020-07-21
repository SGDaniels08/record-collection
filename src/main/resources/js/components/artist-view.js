const renderSingleArtistView = ()=> {

const contentContainer = document.querySelector("main");
contentContainer.classList.add("singleArtistSection");

contentContainer.innerHTML = `
<figure class="singleArtist__figure" >
<img class="singleArtist__picture" src="../static/images/artists/tomWaits.jpg" alt="A picture of band / artist Tom Waits" />
<figcaption class="singleArtist__name">Tom Waits</figcaption>
</figure>

<figure class="singleArtist__album">
<img class="singleArtist__albumPicture" src="../static/images/albums/muleVariations.jpg" alt="Cover art for Mule Variations, an album by Tom Waits"/>
<figcaption class="singleArtist__albumName">Mule Variations</figcaption>
</figure>

<figure class="singleArtist__album">
<img class="singleArtist__albumPicture" src="../static/images/albums/swordfishtrombones.jpg" alt="Cover art for Swordfishtrombones, an album by Tom Waits"/>
<figcaption class="singleArtist__albumName">Swordfishtrombones</figcaption>
</figure>

<figure class="singleArtist__album">
<img class="singleArtist__albumPicture" src="../static/images/albums/realGone.jpg" alt="Cover art for Real Gone, an album by Tom Waits"/>
<figcaption class="singleArtist__albumName">Real Gone</figcaption>
</figure>
`
}

export {renderSingleArtistView}