

function leer_teclado() {
    do {
        var num = parseInt(prompt("Introduce un número entero entre 0 y 25: "));
        if (isNaN(num) || num < 0 || num > 25)
            alert("El número introducido no es correcto.");
    } while (isNaN(num) || num < 0 ||num > 25);
    return num;
}

function factorial(num) {
    var numFactorial = 1;
    for (var i = num; i > 0; i--) {
        numFactorial = numFactorial*i;
    }
    return numFactorial;
}

function main() {
    var num = leer_teclado();
    document.write("El factorial del número es " + factorial(num));
}

main();