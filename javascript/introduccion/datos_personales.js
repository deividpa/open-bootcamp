// Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

// - Tu nombre (string)

// - Tu edad (number)

// - ¿Eres desarrollador? (boolean)

// - Tu fecha de nacimiento (Date)

// - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)

let nombre = "David Perez";
let edad = 26;
let desarrollador = true;
let fechaNacimiento = new Date("april first 1996");

console.log(nombre, fechaNacimiento, desarrollador, fechaNacimiento);
let libroFav = {
  titulo: "El mundo de sofía",
  autor: "Jostein Gaarder",
  fecha: new Date("march 13 1991"),
  url: "https://es.wikipedia.org/wiki/El_mundo_de_Sof%C3%ADa",
};
console.log(libroFav.titulo, libroFav.autor, libroFav.fecha, libroFav.url);
