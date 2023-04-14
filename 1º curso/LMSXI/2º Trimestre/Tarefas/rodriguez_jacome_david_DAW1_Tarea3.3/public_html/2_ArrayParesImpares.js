

var num = new Array(10);

for (var i = 0; i < num.length; i++) {
    do {
        num[i] = parseInt(prompt("Introduce hasta 10 números enteros. Número " + (i + 1) + ": "));
        if (isNaN(num[i]))
            alert("El número introducido no es correcto.");
    } while (isNaN(num[i]));
}

var contadorPar = 0;
var contadorImpar = 0;
var sumaImpar = 0;

for (var i = 0; i < num.length; i++) {
    if (num[i] % 2 == 0) {
        alert("El número " + num[i] + " es par.");
        contadorPar++;
    } else {
        alert("El número " + num[i] + " es impar.");
        contadorImpar++;
        sumaImpar = sumaImpar + num[i];
    }
}
/*
 * media = sumar el valor de números impares (x) / cantidad de números impares.
 */
var mediaImpares = (sumaImpar / contadorImpar);

alert("De los números introducidos, " + contadorPar + " son pares y " + contadorImpar + " son impares.\n\
La suma de los números impares es " + sumaImpar + ", y su media es " + mediaImpares.toFixed(2) + ".");