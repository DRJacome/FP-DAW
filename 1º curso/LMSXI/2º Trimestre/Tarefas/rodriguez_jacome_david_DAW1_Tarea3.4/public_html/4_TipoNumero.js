

function leer_teclado() {
    do {
        var num = parseInt(prompt("Introduce 3 números enteros: "));
        if (isNaN(num))
            alert("El número introducido no es correcto.");
    } while (isNaN(num));
    return num;
}

function tipoNumero(a, b, c) {
    switch (a % 7 === 0 || b % 7 === 0 || c % 7 === 0) {
        case true:
            alert(a + " Es de tipo A.");
            break;
        case false:
        switch (a % 3 === 0 || b % 3 === 0 || c % 3 === 0) {
            case true:
                alert(b + " Es de tipo B.");
                break;
            default:
                alert(c + " Es de tipo C.");
        }
    }
}

function main() {
    var a = leer_teclado();
    var b = leer_teclado();
    var c = leer_teclado();
    tipoNumero(a, b, c);
}

main();