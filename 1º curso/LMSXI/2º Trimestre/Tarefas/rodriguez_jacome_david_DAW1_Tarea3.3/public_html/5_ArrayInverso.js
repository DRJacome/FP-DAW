

var arrayValores = new Array(10);


for (var i = 0; i < arrayValores.length; i++) {
    do {
        arrayValores[i] = parseInt(prompt("Introduce hasta 10 números enteros: "));
        if (isNaN(arrayValores[i]) || arrayValores[i] < 0 || arrayValores[i] > 10)
            alert("Número incorrecto.");
    } while (isNaN(arrayValores[i]) || arrayValores[i] < 0 || arrayValores[i] > 10);
}

alert(arrayValores);

var arrayValoresInverso = new Array(10);

arrayValoresInverso = arrayValores.reverse();

alert(arrayValoresInverso);