
function leer_teclado() {
    var num;
    do {
        num = parseInt(prompt("Cálculo de área de círculo. Introduce un número entero: "));
        if (isNaN(num))
            alert("El número introducido no es correcto")
    } while (isNaN(num));
    return num;
}

function area(base) {
    return Math.PI * Math.pow(base, 2);
}

function main() {
    alert("Área del círculo : " + area(leer_teclado()).toFixed(2));
}

main();