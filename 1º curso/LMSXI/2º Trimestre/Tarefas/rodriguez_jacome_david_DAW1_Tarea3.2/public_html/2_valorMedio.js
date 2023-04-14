
var suma = 0;
var media = 0;

for (var i = 1; i < 11; i++) {
    do {
        var num = parseInt(prompt("Introduce hasta 10 números. Número " + i + ": "));
        if (isNaN(num))
            alert("El número introducido no es correcto.");
    } while (isNaN(num));
    suma = suma + num;
} media = suma / 10;
alert("La suma total de todos los números es " 
        + suma + ", y el valor medio es " + media + ".");
