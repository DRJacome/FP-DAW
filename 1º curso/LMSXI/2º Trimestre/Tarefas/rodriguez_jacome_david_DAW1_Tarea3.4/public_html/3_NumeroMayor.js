

function leer_teclado() {
    do {
        var num = parseInt(prompt("Introduce 3 números enteros: "));
        if (isNaN(num))
            alert("El número introducido no es correcto.");
    } while (isNaN(num));
    return num;
}

function calcular_mayor(a, b, c) {
    if (a > b) {
        if (a > c) {
            alert(a + " es mayor que " + b + " y que " + c);
        } else
            alert(c + " es mayor que " + a + " y que " + b);
    } else if (b > c) {
        alert(b + " es mayor que " + a + " y que " + c);
    } else {
        alert(c + " es mayor que " + a + " y que " + b);
    }
}

function main() {
    var a = leer_teclado();
    var b = leer_teclado();
    var c = leer_teclado();
    calcular_mayor(a,b,c);
}

main();