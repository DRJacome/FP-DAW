
var arrayLista = new Array(20);

for (var i = 0; i < arrayLista.length; i++) {
    do {
        arrayLista[i] = parseInt(prompt("Introduce un número entero. Número " + (i + 1) + ": "));
        if (isNaN(arrayLista[i]))
            alert("El número introducido no es correcto.");
    } while (isNaN(arrayLista[i]));
}
var acumulador = 1;
var max = 0;

for (var i = 0; i < arrayLista.length; i++) {
    if (arrayLista[i] < arrayLista[i + 1]) {
        acumulador++;
    } else if (acumulador > max) {
        max = acumulador;
        acumulador = 1;
    } else {
        acumulador = 1;
    }
}
alert("Tamaño de secuencia creciente más larga encontrada: " + max);