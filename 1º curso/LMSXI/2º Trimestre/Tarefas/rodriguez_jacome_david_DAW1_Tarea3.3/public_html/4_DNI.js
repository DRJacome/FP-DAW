
var letra = ['T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','l','C','K','E'];

do {
    var dni = (prompt("Introduce tu número de DNI para calcular la letra que te corresponde. Debes introducir 8 dígitos: "));
        if (isNaN(dni) || dni.length != 8)
            alert("El valor introducido no es correcto.");
} while (isNaN(dni) || dni.length != 8);

alert(dni + " " + letra[dni % 23]);