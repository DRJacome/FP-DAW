
do {
    var num = parseInt(prompt("Introduce un número comprendido entre 0 y 99: "));
    if (isNaN(num) || num < 0 || num > 99)
        alert("ERROR!" + num + " no es un número válido.");
} while (isNaN(num) || num < 0 || num > 99);

for (var i = 0; i <= num; i++) {
    if (i % 2 === 0) {
        document.write(i + " ");
    }
} 