
var contadorPar = 0;
var contadorImpar = 0;

for (var i = 1; i <= 5; i++) {
    do {
        var num = parseInt(prompt("Introduce 5 números enteros. Número " + i + ": "));
            if(isNaN(num))
                alert("El número introducido no es correcto.");
    } while (isNaN(num));
    
    if (num % 2 == 0) {
        //alert (num + " es par.");
        contadorPar ++;
    } else {
        //alert(num + " es impar.");
        contadorImpar ++;
    }
} alert("De los 5 números introducidos, " 
        + contadorPar + " son pares y " 
        + contadorImpar + " son impares.")