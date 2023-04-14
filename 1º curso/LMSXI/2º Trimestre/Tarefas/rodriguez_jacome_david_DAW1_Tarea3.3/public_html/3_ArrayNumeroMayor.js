

var num = new Array(10);


for (var i = 0; i < num.length; i++) {
    do {
        num[i] = parseInt(prompt("Introduce hasta 10 números enteros. Número " + (i + 1) + ": "));
        if (isNaN(num[i]))
            alert("El número introducido no es correcto.");
    } while (isNaN(num[i]));
}



var acumulador = num[0];
for (var i = 1; i < num.length; i++) {
    if (num[i] > acumulador)
        acumulador = num[i];
}
alert("El mayor número de todos es " + acumulador + ".");