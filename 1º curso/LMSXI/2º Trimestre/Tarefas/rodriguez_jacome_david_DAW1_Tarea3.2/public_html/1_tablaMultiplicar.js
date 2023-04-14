
do {
    var num = parseInt(prompt("Introduce un número entero entre 1 y 10: "));
    if (isNaN(num) || num < 1 || num > 10)
        alert("El número introducido no es correcto. Introduza un número entero entre 1 y 10.");
} while (isNaN(num) || num < 1 || num > 10);

document.write("Tabla de multiplicar del " + num + ":" + "<br/");
for (var i = 1; i < 11; i++) {
    document.write("<br/>" + i + " x " + num + " = " + (i * num));
}