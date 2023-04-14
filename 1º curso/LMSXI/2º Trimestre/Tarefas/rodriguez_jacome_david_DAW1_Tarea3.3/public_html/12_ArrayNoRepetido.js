

var arrayLista = new Array(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

var acumulador;
for (var i = 0; i < arrayLista.length; i++) {
    acumulador = arrayLista[i];
    for (var j = i + 1; j < arrayLista.length; j++) {
        if (arrayLista[j] === acumulador) {
            arrayLista.splice(j, 1);
            i--;
        }
    }
}
document.write("Lista sin repetidos: " + arrayLista);