
do {
    var a = parseInt (prompt("Introduce un num1: "));
    if (isNaN(a) || ( a % 2 != 0 ));
        alert ("ERROR!" + a + "no es un valor numérico");
} while (isNaN(a) || ( a % 2 != 0 ));
   

do {
    var a = parseInt (prompt("Introduce un num1: "));
    if (isNaN(b) || ( b % 2 != 0 ));
        alert ("ERROR!" + a + "no es un valor numérico");
} while (isNaN (b) || ( b % 2 != 0 ));

alert (a + b );