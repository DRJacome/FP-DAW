


var num = new Array(10);

for (var i = 0; i < num.length; i++) {
    do {
        num[i] = parseInt(prompt("Introduce hasta 10 números enteros. Número " + (i + 1) + ": "));
        if (isNaN(num[i]))
            alert("El número introducido no es correcto.");
    } while (isNaN(num[i]));
}

for (var i = 0; i < num.length; i++) {
    document.write(num[i] + "<br/>");
}
