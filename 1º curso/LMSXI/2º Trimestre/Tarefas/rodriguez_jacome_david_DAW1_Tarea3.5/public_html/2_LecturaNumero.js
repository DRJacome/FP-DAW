

class EntradaSalida {
    static leerTeclado() {
        do {
            var num = parseInt(prompt("Introduce un número entero para mostrarlo por pantalla: "));
            if (isNaN(num)) {
                alert("Valor incorrecto.");
            }
        } while (isNaN(num));
        return num;
    }
}

alert(EntradaSalida.leerTeclado());