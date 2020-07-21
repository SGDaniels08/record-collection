const renderSongsView = ()=> {

const contentContainer = document.querySelector("main");
contentContainer.classList.add("songs__mainSection");

contentContainer.innerHTML = `
      <h2 class="songs__title">Songs</h2>
        <ul class="songs__allSongs">
          <li class="songs__song">A Sentence of Sorts in Kongsvinger -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Between Two Lungs -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Big in Japan -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Black Market Baby -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Blinding -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Bunny Ain't No Kind of Rider -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Cato as a Pun -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Chocolate Jesus -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Cold Water -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Come on up to the House -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Cosmic Love -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Dog Days Are Over -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Drumming Song -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Eyeball Kid -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Faberge Falls for Shuggie -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Filipino Box Spring Hog -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Georgia Lee -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Get Behind the Mule -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Girl with One Eye -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Gronlandic Edit -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Heimdalsgate Like a Promethean Curse -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Hold On -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">House Where Nobody Lives -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Howl -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Hurricane Drunk -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">I'm Not Calling You a Liar -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Kiss with a Fist -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Labyrinthian Pomp -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Lowside of the Road -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">My Boy Builds Coffins -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">Picture in a Frame -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Pony -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">Rabbit Heart (Raise It Up) -- Lungs, by Florence + the Machine</li>
          <li class="songs__song">She's a Rejecter -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Sink the Seine -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Suffer for Fashion -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">Take It with Me -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">The Past Is a Grotesque Animal -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">We Were Born the Mutants Again with Leafling -- Hissing Fauna, Are You the Destroyer?, by of Montreal</li>
          <li class="songs__song">What's He Building? -- Mule Variations, by Tom Waits</li>
          <li class="songs__song">You've Got the Love (bonus track) -- Lungs, by Florence + the Machine</li>
        </ul>
`
}

export {renderSongsView}