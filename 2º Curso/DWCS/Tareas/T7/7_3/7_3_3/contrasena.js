let vector = new Array();

function comprobarContrasena(contrasena) {
    if (vector.length < 1) {
        guardarContrasena(contrasena);
    } else {
        if (contrasena == vector[0]) {
            window.open("imagen.html");
        } else {
            alert("La contraseña no es correcta. Inténtalo de nuevo.");
        }
    }
}

function guardarContrasena(contrasena) {
    let contNumero = "0";
    let contLetra = "0";

    for (let i = 0; i < contrasena.length; i++) {
        if (contrasena.charAt(i) == "L") {
            contLetra++;
        };
        if (contrasena.charAt(i) == 3) {
            contNumero++;
        }
    }
    if (contNumero > 0 && contLetra > 0 && contrasena.length > 4 && contrasena.length < 11) {
        vector.push(contrasena)
    } else {
        alert("Introduce una contraseña que cumpla con los requisitos:\n"
            + "Letra L máyuscula\n"
            + "número 3\n"
            + "la contraseña debe tener entre 5 y 10 caracteres.");
    }
}
