

function leerMes() {
    do {
        var mes = parseInt(prompt("Selecciona un número de mes: "));
        if (isNaN(mes) || mes < 1 || mes > 12)
            alert("Incorrecto.");
    } while (isNaN(mes) || mes < 1 || mes > 12);
    return mes;
}

function leerDia(mes) {
    var correcto = false;
    do {
        var dia = parseInt(prompt("Selecciona un número de día: "));
        if (isNaN(dia) || dia < 1 || dia > 31) {
            alert("Incorrecto.");
        } else if (mes == 2 && dia > 28) {
            alert("Febrero no tiene más de 28 días.")
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            alert("Este mes no tiene más de 30 días.")
        } else {
            correcto = true;
        }
    } while (correcto == false);
    return dia;
}

function tiempoRestante(dia, mes) {
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
    return horas;
}

function main() {
        var mes = leerMes();
        var dia = leerDia(mes);
        alert("Horas restantes de mes: " + tiempoRestante(dia,mes));
}

main();