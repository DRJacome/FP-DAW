
do {
    var a = parseInt (prompt("Introduce un num1: "));
    if (isNaN(a))
        alert ("ERROR!" + a + "no es un valor numérico.");
} while (isNaN(a));
   

do {
    var b = parseInt (prompt("Introduce un num2: "));
    if (isNaN(b))
        alert ("ERROR!" + a + "no es un valor numérico");
} while (isNaN (b));

alert ( a + b );