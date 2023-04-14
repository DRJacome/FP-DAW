//
//math.floor((math.random() * 80) +1 ) -1;


alert("Juego de adivinanzas. El jugador 1 dirá un número y el jugador 2 deberá adivinarlo en 4 intentos o menos.");

var numAleatorio;

do {
    var numAleatorio = parseInt(prompt("Jugador 1: introduce un número entre 0 y 25: "));
    if (isNaN(numAleatorio) || numAleatorio < 0 || numAleatorio > 25)
        alert("El número introducido no es correcto.");
} while (isNaN(numAleatorio) || numAleatorio < 0 || numAleatorio > 25);


alert("Jugador 2: ahora deberás averiguar qué número ha introducido el jugador 1 en 4 intentos o menos.")


var intentos = 4;
do {    
    do {
         var num = parseInt(prompt("Jugador 2: introduce un número entre 0 y 25: "));
         if (isNaN(num) || num < 0 || num > 25)
        alert("El número introducido no es correcto.");
   }while (isNaN(num) || num < 0 ||  num > 25);

if (num != numAleatorio) {
    alert("Número incorrecto. Te quedan " + (--intentos) + " intentos.");
} else {
    alert("Número correcto. Has ganado!");
}

} while (num != numAleatorio && intentos > 0);


if (num != numAleatorio) {
    alert("Has perdido. El número correcto era " + numAleatorio + ".");
}
