var resultado = 0;
var contador = 1;

do {
    var azar = parseInt(prompt("Puedes introducir números. El programa terminará cuando se introduzcan 50 números. Número " + contador + ": "));
    if (isNaN(azar))
        alert("No es un número");
    resultado += azar;
    contador++;
} while (isNaN(azar) || resultado <= 50);

alert(resultado + ". Programa terminado.");