
var num = new Array(20);

for (var pos = 0; pos < num.length; pos++) {
    do {
        num[pos] = parseInt(prompt("Introduce hasta 20 números enteros. Número " + (pos + 1) + ": "));
        if (isNaN(num[pos]))
            alert("El número introducido no es correcto.")
    } while (isNaN(num[pos]));
}

document.write("Lista original: " + num + "<br/>");

var numConsulta = parseInt(prompt("Introduce el/los número/s de la lista que quieras borrar: "));

while (num.indexOf(numConsulta) != -1) {
    num.splice(num.indexOf(numConsulta), 1);
}

document.write(" Lista actualizada " + num + "<br/>");