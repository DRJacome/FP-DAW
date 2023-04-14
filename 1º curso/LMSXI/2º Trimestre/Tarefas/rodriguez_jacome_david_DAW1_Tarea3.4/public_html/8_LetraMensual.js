

function leer_teclado(max, min, mensaje) {
    do {
        var marca = parseInt(prompt(mensaje));
        if (isNaN(marca)|| marca < min || marca > max)
            alert("ERROR! La marca introducida no es correcta.");
    } while (isNaN(marca)|| marca < min || marca > max);
    return marca;
}

function precio(num) {
    var precio;
    switch (num) {
        case 1:
            precio = 25000;
            break;
        case 2:
            precio = 30000;
            break;
        default:
            precio = 35000;
    }
    return precio;
}


function pagoMensual(anos, precio) {
    var letraMensual;
    if (anos == 0) {
        alert("Pagará el vehículo seleccionado al contado. Su precio es " + precio + " EUR.");
    } else {
        letraMensual = precio/anos/12;
        alert("La cantidad a abonar por cuota es de " + letraMensual.toFixed(2) + " EUR/mes durante " + anos + " años.");
    }
}

function main() {
    var mensaje1 = "Menú: \n1 Audi \n2 BMW \n3 Volvo \n Escribe el número del coche que deseas: ";
    var coche = leer_teclado(3,1, mensaje1);
    var mensaje2 = "Indica en cuántos años deseas pagar el coche (máximo 10 años): ";
    var anos = leer_teclado(10,0,mensaje2);
    
    pagoMensual(anos, precio(coche));
}

main();