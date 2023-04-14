
do {
    var num1 = parseInt(prompt("Introduce un primer número entero: "));
    if (isNaN(num1))
        alert("ERROR! el valor introducido no es correcto.");
    var num2 = parseInt(prompt("Introduce un segundo número entero: "));
    if (isNaN(num2))
        alert("ERROR! el valor introducido no es correcto.");
} while (isNaN(num1) || (isNaN(num2)));

var numeros;
if (num1 < num2) {
    for (var i = num1; i < num2; i++) {
        document.write(i + " ");
    }
} else {
    for (var j = num2; j < num1; j++) {
        document.write(j + " ");
    }
}