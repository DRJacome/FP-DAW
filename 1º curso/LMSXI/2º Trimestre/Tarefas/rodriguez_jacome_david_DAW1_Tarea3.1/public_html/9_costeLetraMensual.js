
do {
    var marca = parseInt(prompt("Selecciona una de las siguientes marcas (1: AUDI, 2: BMW, 3: VOLVO): "));
    if (isNaN(marca) || marca != 1 && marca != 2 && marca != 3)
        alert("ERROR! La marca introducida no es correcta.");
} while (isNaN(marca) || marca != 1 && marca != 2 && marca != 3);

var precio;
switch (marca) {
    case 1:
        precio = 25000;
        break;
    case 2:
        precio = 30000;
        break;
    default:
        precio = 35000;
}

do {
    var anos = parseInt(prompt("Selecciona la cantidad de cuotas a pagar\n\
                             (máximo 10 cuotas/año. 0: pago al contado): "));
    if (isNaN(anos) || anos < 0 || anos > 10)
        alert("ERROR! El número introducido no es correcto.");
} while (isNaN(anos) || anos < 0 || anos > 10);

var letraMensual;

if (anos == 0) {
    alert("Pagará el vehículo seleccionado al contado. Su precio es " + precio + " EUR.");
} else {
    letraMensual = precio / anos / 12;
    alert("La cantidad a abonar por cuota es de " + letraMensual.toFixed(2) + " EUR/mes duante " + anos + " años.");
}