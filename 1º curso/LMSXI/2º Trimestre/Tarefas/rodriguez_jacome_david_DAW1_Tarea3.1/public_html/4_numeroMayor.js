
do {
    var a = parseInt (prompt("Introduce un primer número: "));
    if (isNaN(a))
        alert ("ERROR!" + a + "no es un valor numérico.");
} while (isNaN(a));

do {
    var b = parseInt (prompt("Introduce un segundo número: "));
    if (isNaN(b))
        alert ("ERROR!" + b + "no es un valor numérico.");
} while (isNaN(b));

do {
    var c = parseInt (prompt("Introduce un tercer número: "));
    if (isNaN(c))
        alert ("ERROR!" + c + "no es un valor numérico.");
} while (isNaN(c));


if (a > b) {
    if (a > c) {
        alert (a + " es mayor que " + b + " y que " + c); 
    } else
        alert (c + " es mayor que " + a + " y que " + b);
} else if (b > c) {
    alert (b + " es mayor que " + a + " y que " + c);
} else {
    alert (c + " es mayor que " + a + " y que " + b);
}