
do {
    var num = parseInt(prompt("Introduce un número entero entre 0 y 25: "));
    var factorial = 1;
    if (isNaN(num) || (num < 0 || num > 25 ))
        alert("ERROR! " + num + " no es un valor correcto.");
} while (isNaN(num) || (num < 0 || num > 25 ));

for (var i = num; i > 0; i--) {
    factorial = i*factorial;
} alert("El factorial de " + num + " es " + factorial);