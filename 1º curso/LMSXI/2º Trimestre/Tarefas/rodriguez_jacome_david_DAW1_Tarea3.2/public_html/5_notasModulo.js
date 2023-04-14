 
do {
    var modulos = parseInt(prompt("Introduce la cantidad de módulos: "));
            if (isNaN(modulos))
            alert("Valor no correcto.");
} while (isNaN(modulos));

var media = 0;
var resultado;

for (var i = 1; i <= modulos; i++) {
    do {
        var notas = parseFloat(prompt("Introduce la nota del módulo " + i + ": "));
            if (isNaN(notas) || notas < 0 || notas > 10)
                alert("Número no válido.");
    } while (isNaN(notas) || notas < 0 || notas > 10);
    
    media = media + notas;
} resultado = media / modulos;

document.write("Nota media de todos los módulos: " + resultado.toFixed(2));