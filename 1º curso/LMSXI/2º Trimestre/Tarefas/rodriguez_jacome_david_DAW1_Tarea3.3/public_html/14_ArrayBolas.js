

var arrayBolas = new Array(80);

for (var i = 0; i < arrayBolas.length; i++) {
    arrayBolas[i] = 0;
}

do {
    arrayBolas[Math.floor((Math.random() * 80) + 1) - 1]++;
} while (arrayBolas[32] != 3);

for (var i = 0; i < arrayBolas.length; i++) {
    document.write("La bola " + (i + 1) + ": " + arrayBolas[i] + "<br\>");
}