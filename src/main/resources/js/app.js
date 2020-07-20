import { fetchAllArtists } from "./api-helper.js"

console.log(fetchAllArtists());

const contentContainer = document.createElement("main");
contentContainer.classList.add("content__container");
contentContainer.innerHTML = "IS THE JS WORKING?";

const body = document.querySelector("body");

body.appendChild(contentContainer);

