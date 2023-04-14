
do {
    var articulo = parseInt(prompt("Introduce el número de artículos que has adquirido: "));
    if (isNaN(articulo))
        alert("ERROR. Debes introducir un número entero.");
} while (isNaN(articulo));


suma = 0;
precioTotal = 0;
for (var i = 0; i < articulo; i++) {
    do {
        var precio = parseFloat(prompt("Introduce el precio del artículo " + (i + 1) + ": "));
        if (isNaN(precio) || precio < 0)
            alert("Error. El precio introducido no es válido");
        //contador = contador + precio; -> abreviado: contador+=precio.
        suma+=precio;
    } while (isNaN(precio) || precio < 0);

}

precioTotal = suma + (suma * 0.21);
alert("El precio total de los artículos es de " + precioTotal + " EUR. incluyendo IVA 21%.");