

function leer_teclado() {
    do {
        var num = parseInt(prompt("Introduce un número entre 0 y 99: "));
        if (isNaN(num) || num < 0 || num > 99)
            alert("El número introducido no es correcto.");
    } while (isNaN(num) || num < 0 || num > 99);
    return num;
}

function listarNumero(num) {
    for (var i = 0; i <= num; i++) {
        if (i % 2 === 0) {
            document.write(i + " ");
        }
    }
}

function main() {
    num = leer_teclado();
    listarNumero(num);
}

main();