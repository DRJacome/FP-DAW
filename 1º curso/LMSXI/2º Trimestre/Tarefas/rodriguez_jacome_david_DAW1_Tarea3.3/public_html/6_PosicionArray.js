

var num = new Array(10);

for (var pos = 0; pos < num.length; pos++) {
    do {
        num[pos] = parseInt(prompt("Introduce hasta 10 números enteros. Número " + (pos + 1) + ": "));
        if (isNaN(num[pos]))
            alert("El número introducido no es correcto.")
    } while (isNaN(num[pos]));
}

var numConsulta = parseInt(prompt("Introduce el número del que quieras saber su posición en la lista."));

//Solución con funciones.
if (num.indexOf(numConsulta) != -1) {
    alert("El número " + numConsulta + " se encuentra en la posición " + (num.indexOf(numConsulta)) + " de la lista.")
} else {
    alert("El elemento " + numConsulta + " no se encuentra en la lista.")
}

//Solución sin funciones.
/*pos = 0;
 while ((pos < num.length -1) && (num[pos] != numConsulta))
 pos++;
 
 if (num[pos] == numConsulta) {
 alert("El número " + numConsulta + " se encuentra en la posición " + pos + " de la lista.")
 } else {
 alert("El elemento " + numConsulta + " no se encuentra en la lista.")
 }*/