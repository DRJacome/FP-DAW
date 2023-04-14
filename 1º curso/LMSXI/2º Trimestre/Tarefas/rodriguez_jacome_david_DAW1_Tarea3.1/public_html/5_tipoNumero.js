
for (var i = 0; i < 3; i++) {
    do {
        var num = parseInt(prompt("Introduce un número: "));
        if (isNaN(num))
            alert("ERROR!" + num + "no es un valor numérico.");
    } while (isNaN(num));

    switch (num % 7 === 0) {
        case true:
            alert(num + " es de tipo A.");
    }
    switch (num < 0 && num % 3 === 0) {
        case true:
            alert(num + " es de tipo B.");
            break;
        default:
            alert(num + " es de tipo C.");
    }
}