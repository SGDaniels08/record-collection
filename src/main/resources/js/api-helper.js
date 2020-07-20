
/* All fetch functions */

const fetchAllArtists = async () => {
    return fetch("http://localhost:8080/api/artists")
        .then(response => response.json())
}

export {fetchAllArtists}