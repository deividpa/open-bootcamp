// - factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while

let factorial = 1;
let count = 1;

while (count <= 10) {
  factorial = factorial * count;
  count += 1;
}

console.log(factorial);
