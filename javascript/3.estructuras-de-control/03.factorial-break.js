// - factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break

let count = 1;
let factorial = 1;

while (count < 20) {
  factorial *= count;
  if (count === 10) {
    break;
  }
  count += 1;
}
console.log(factorial);
