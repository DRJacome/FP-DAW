

function leer_teclado() {
    do {
        var num = parseInt(prompt("Introduce un primer número entero: "));
        if (isNaN(num))
            alert("ERROR! el valor introducido no es correcto.");
    } while (isNaN(num));
    return num;
}


function pares(num1, num2) {
    if (num1 < num2) {
        for (var i = num1; i < num2; i++) {
            document.write(i + " ");
        }
    } else {
        for (var j = num2; j < num1; j++) {
            document.write(j + " ");
        }
    }
}

function main() {
   var num1 = leer_teclado();
   var num2 = leer_teclado();
    pares(num1, num2);
}

main();