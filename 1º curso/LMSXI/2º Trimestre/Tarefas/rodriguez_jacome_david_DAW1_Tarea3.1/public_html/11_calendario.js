do {
    var mes = parseInt(prompt("Selecciona un número de mes: "));
    var dia = parseInt(prompt("Selecciona un número de día: "));
    var correcto = false;

    if (isNaN(mes) || isNaN(dia) || dia > 31) {
        alert("ERROR! Los valores introducidos no son correctos.");
    } else if (mes == 2 && dia > 28) {
        alert("Febrero.");
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
        alert("Este mes tiene 30 días.")
    } else {
        correcto = true;
    }
} while (correcto == false);

var restante;
var horas;
if (mes == 2) {
    restante = 28 - dia;
    horas = restante * 24;
} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
    restante = 30 - dia;
    horas = restante * 24;
} else {
    restante = 31 - dia;
    horas = restante * 24;
}
if (horas == 0) {
    alert("El mes ha terminado.")
} else {
    alert("Quedan " + horas + " horas hasta que termine el mes.");
}