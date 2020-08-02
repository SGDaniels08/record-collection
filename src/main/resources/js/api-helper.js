/* All fetch functions */

const fetchAllArtists = async () => {
  return fetch("http://localhost:8080/api/artists").then((response) =>
    response.json()
  );
};

const fetchSingleArtist = async (artistId) => {
  return fetch(
    `http://localhost:8080/api/artists/${artistId}`
  ).then((response) => response.json());
};

const fetchRandomArtist = async() => {
  return fetch(`http://localhost:8080/api/artists/random`)
  .then((response) => response.json());
}

const fetchAllAlbums = async () => {
  return fetch("http://localhost:8080/api/albums").then((response) =>
    response.json()
  );
};

const fetchSingleAlbum = async (albumId) => {
  return fetch(`http://localhost:8080/api/albums/${albumId}`).then((response) =>
    response.json()
  );
};

const fetchRandomAlbum = async() => {
  return fetch(`http://localhost:8080/api/albums/random`)
  .then((response) => response.json());
}

const fetchAlbumArtist = async(albumId) => {
  return fetch(`http://localhost:8080/api/albums/${albumId}/artist`)
  .then((response)=> response.json());
};

const fetchAllSongs = async () => {
  return fetch("http://localhost:8080/api/songs").then(
    (response) => response.json()
  );
};

const fetchSingleSong = async (songId) => {
  return fetch(`http://localhost:8080/api/songs/${songId}`).then(
    (response) => response.json()
  );
};

const fetchRandomSong = async() => {
  return fetch(`http://localhost:8080/api/songs/random`)
  .then((response) => response.json());
}

const fetchSongAlbum = async (songId) => {
  return fetch(`http://localhost:8080/api/songs/${songId}/album`)
  .then((response)=> response.json());
};

export {
  fetchAllArtists,
  fetchSingleArtist,
  fetchRandomArtist,
  fetchAllAlbums,
  fetchSingleAlbum,
  fetchRandomAlbum,
  fetchAlbumArtist,
  fetchAllSongs,
  fetchSingleSong,
  fetchRandomSong,
  fetchSongAlbum
};
