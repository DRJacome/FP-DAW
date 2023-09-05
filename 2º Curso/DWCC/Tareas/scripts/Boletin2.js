function opcionSubmenu_2(opcion) {
    exercicio1.classList.remove("activo");
    exercicio2.classList.remove("activo");
    exercicio3.classList.remove("activo");
    exercicio4.classList.remove("activo");
    exercicio5.classList.remove("activo");
    exercicio6.classList.remove("activo");
    exercicio7.classList.remove("activo");
    exercicio8.classList.remove("activo");
    exercicio9.classList.remove("activo");
    exercicio10.classList.remove("activo");
    exercicio11.classList.remove("activo");
    exercicio12.classList.remove("activo");
    exercicio13.classList.remove("activo");
    exercicio14.classList.remove("activo");
    exercicio15.classList.remove("activo");
    exercicio16.classList.remove("activo");
    switch (opcion) {
        case 1:
            exercicio1.classList.add("activo");
            break;
        case 2:
            exercicio2.classList.add("activo");
            break;
        case 3:
            exercicio3.classList.add("activo");
            break;
        case 4:
            exercicio4.classList.add("activo");
            break;
        case 5:
            exercicio5.classList.add("activo");
            break;
        case 6:
            exercicio6.classList.add("activo");
            break;
        case 7:
            exercicio7.classList.add("activo");
            break;
        case 8:
            exercicio8.classList.add("activo");
            break;
        case 9:
            exercicio9.classList.add("activo");
            break;
        case 10:
            exercicio10.classList.add("activo");
            break;
        case 11:
            exercicio11.classList.add("activo");
            break;
        case 12:
            exercicio12.classList.add("activo");
            break;
        case 13:
            exercicio13.classList.add("activo");
            break;
        case 14:
            exercicio14.classList.add("activo");
            break;
        case 15:
            exercicio15.classList.add("activo");
            break;
        case 16:
            exercicio16.classList.add("activo");
            break;
        default:
            break;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_1(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Imprimir o valor absoluto dun número dado.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num">Introduce un número: </label><input id="num"></p>' +
        '<button type="button" onclick="valorAbsoluto(parseFloat(num.value))">Calcular</button>' +
        '</form>';
    resultado.innerHTML = "";
}

function valorAbsoluto(num) {

    if (isNaN(num)) {
        resultado.innerHTML = "Incorrecto. Introduce un número:";
    } else {
        var x = parseFloat(num);
        if (x < 0) {
            x *= (-1);
        } else {
            x;
        }
        resultado.innerHTML = "El valor absoluto de " + num + " es " + x;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_2(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Calcular a superficie dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="figura">¿Qué tipo de figura geométrica quieres elegir?</label></p>' +
        '<p><select id="figura" onChange="areaFigura(figura.value)"></p>' +
        '<option selected disabled>Escoge una figura</option>' +
        '<option value="triangulo">Triángulo</option>' +
        '<option value="cadrado">Cadrado</option>' +
        '<option value="rectangulo">Rectángulo</option>' +
        '<option value="circulo">Círculo</option>' +
        '</select>' +
        '</form>';
    resultado.innerHTML = "";
}

function areaFigura(figura) {
    switch (figura) {
        case 'triangulo':
        case 'rectangulo':
            datos.innerHTML =
                '<form>' +
                '<p><label for="baseR">Introduce la base en centímetros: </label><input id="baseR"></p>' +
                '<p><label for="alturaR">Introduce la altura en centímetros: </label><input id="alturaR"></p>' +
                '<button type="button" onclick="calcularAreas(\'' + figura + '\',baseR.value, alturaR.value)">Calcular</button>' +
                '</form>';
            resultado.innerHTML = "";
            break;
        case 'cadrado':
        case 'circulo':
            var literal = (figura == 'cadrado') ? 'lado' : 'radio';
            datos.innerHTML =
                '<form>' +
                '<p><label for="radioC">' + literal + ':<label><input id="radioC"></p>' +
                '<button type="button" onclick="calcularAreas(\'' + figura + '\', radioC.value, radioC.value)">Calcular</button>' +
                '</form>';
            resultado.innerHTML = "";
            break;
        default:
            alert("La figura" + figura + "no está contemplada.");
            break;
    }
}

function calcularAreas(figura, parametro1, parametro2) {
    var texto = "";
    if (isNaN(parametro1A) && (isNaN(parametro2A))) {
        if (parametro1A <= 0 || parametro2A <= 0) {
            texto = "Los números introducidos deben ser mayores que 0.";
        } else {
            var parametro1A = parseFloat(parametro1);
            var parametro2A = parseFloat(parametro2);
            switch (figura) {
                case 'triangulo':
                    var area = (parametro1A * parametro2A) / 2;
                case 'rectangulo':
                    var area = parametro1A * parametro2A;
                    break;
                case 'cadrado':
                    //alert(parametro1A);
                    var area = Math.pow(parametro1A, 2);
                case 'circulo':
                    var area = Math.PI * Math.pow(parametro1A, 2);
                    break;
                default:
                    texto = "La figura" + figura + "no está contemplada.";
                    break;
            }
            texto = "El área del " + figura + " es de: " + area.toFixed(2) + "  cm².";
        }
    } else {
        texto = "Debes introducir números.";
    }
    resultado.innerHTML = texto;
}

/*function calcularArea(parametro1, parametro2) {
    var parametro1A = parseFloat(parametro1);
    var parametro2A = parseFloat(parametro2);
    var areaTriangulo = (parametro1A * parametro2A) / 2;
    var areaCadrado = parametro1A * parametro1A;
    var areaRectangulo = parametro1A * parametro2A;
    var areaCirculo = (Math.PI * Math.pow(radio, 2));
}

function areaTriangulo(base, altura) {
    var baseT = parseFloat(base);
    var alturaT = parseFloat(altura);
    var areaT = (baseT * alturaT) / 2;
    resultado.innerHTML = "El área del triángulo es " + areaT.toFixed(2) + " cm².";
}

function areaCadrado(lado) {
    var ladoCa = parseFloat(lado);
    var areaCa = Math.pow(ladoCa, 2);
    resultado.innerHTML = "El área del cuadrado es " + areaCa.toFixed(2) + " cm².";
}

function areaRectangulo(base, altura) {
    var baseR = parseFloat(base);
    var alturaR = parseFloat(altura);
    var areaR = baseR * alturaR;
    resultado.innerHTML = "El área del rectángulo es " + areaR.toFixed(2) + " cm²";
}

function areaCirculo(radio) {
    var radioC = parseFloat(radio);
    var areaC = Math.PI * Math.pow(radioC, 2);
    resultado.innerHTML = "El área del círculo es " + areaC.toFixed(2) + "cm².";
}*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


function exercicio2_3(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Modifica o programa anterior para que, dadas dúas figuras, indique cal delas ten unha superficie maior.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="baseTriangulo">Introduce la base del triángulo en centímetros: </label><input id="baseTriangulo"></p>' +
        '<p><label for="alturaTriangulo">Introduce la altura del triángulo en centímetros: </label><input id="alturaTriangulo"></p>' +
        '<p><label for="ladoCadrado">Introduce el lado del cuadrado en centímetros :</label><input id="ladoCadrado"></p>' +
        '<p><label for="baseRectangulo">Introduce la base del rectángulo en centímetros: </label><input id="baseRectangulo"></p>' +
        '<p><label for="alturaRectangulo">Introduce la altura del rectángulo en centímetros: </label><input id="alturaRectangulo"></p>' +
        '<p><label for="radioCirculo">Introduce el radio del círculo en centímetros: <label><input id="radioCirculo"></p>' +
        '<button type="button" onclick="areasFiguras(baseTriangulo.value, alturaTriangulo.value, ladoCadrado.value, baseRectangulo.value, alturaRectangulo.value, radioCirculo.value)">Calcular</button>' +
        '</form>';
    /*   function areaFigura(figura) {
           switch (figura) {
               case 'triangulo':
                   datos.innerHTML =
                       '<form>' +
                       '<p><label for="baseT">Introduce la base en centímetros: </label><input id="baseT"></p>' +
                       '<p><label for="alturaT">Introduce la altura en centímetros: </label><input id="alturaT"></p>' +
                       '<button type="button" onclick="areaTriangulo(baseT.value, alturaT.value)">Calcular</button>' +
                       '</form>';
                   break;
               case 'cadrado':
                   datos.innerHTML =
                       '<form>' +
                       '<p><label for="ladoCa">Introduce el lado en centímetros :</label><input id="ladoCa"></p>' +
                       '<button type="button" onclick="areaCadrado(ladoCa.value)">Calcular</button>' +
                       '</form>';
                   break;
               case 'rectangulo':
                   datos.innerHTML =
                       '<form>' +
                       '<p><label for="baseR">Introduce la base en centímetros: </label><input id="baseR"></p>' +
                       '<p><label for="alturaR">Introduce la altura en centímetros: </label><input id="alturaR"></p>' +
                       '<button type="button" onclick="areaRectangulo(baseR.value, alturaR.value)">Calcular</button>' +
                       '</form>';
                   break;
               case 'circulo':
                   datos.innerHTML =
                       '<form>' +
                       '<p><label for="radioC">Introduce el radio en centímetros: <label><input id="radioC"></p>' +
                       '<button type="button" onclick="areaCirculo(radioC.value)">Calcular</button>' +
                       '</form>';
                   break;
               default:
                   "Non sei qué figura é esa";
                   break;
           }
       }*/
}

function areasFiguras(baseT, alturaT, ladoCa, baseR, alturaR, radioC) {
    var baseTr = parseFloat(baseT);
    var alturaTr = parseFloat(alturaT);
    var areaT = (baseTr * alturaTr) / 2;

    var ladoCad = parseFloat(ladoCa);
    var areaCa = Math.pow(ladoCad, 2);

    var baseRe = parseFloat(baseR);
    var alturaRe = parseFloat(alturaR);
    var areaR = baseRe * alturaRe;

    var radioCi = parseFloat(radioC);
    var areaC = Math.PI * Math.pow(radioCi, 2);
}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_4(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Calcula o perímetro dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="tipoFigura">¿Qué tipo de figura geométrica quieres elegir?</label></p>' +
        '<p><select id="tipoFigura" name="tipoFigura"></p>' +
        '<option value="" selected="selected"> - Selecciona una figura - </option>' +
        '<option value="triangulo">Triángulo</option>' +
        '<option value="cadrado">Cadrado</option>' +
        '<option value="rectangulo">Rectángulo</option>' +
        '<option value="circulo">Círculo</option></select>' +
        '<p><button type="button" onclick="perimetroFigura(tipoFigura.value)">Calcular perímetro</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function perimetroFigura(figura) {
    switch (figura) {
        case 'triangulo':
            datos.innerHTML =
                '<form>' +
                '<p><label for"lado1T">¿Cuánto mide el primer lado en centímetros? </label><input id="lado1T"></p>' +
                '<p><label for"lado2T">¿Cuánto mide el segundo lado en centímetros? </label><input id="lado2T"></p>' +
                '<p><label for"lado3T">¿Cuánto mide el último lado en centímetros? </label><input id="lado3T"></p>' +
                '<button type="button" onclick="perimetroTriangulo(lado1T.value, lado2T.value, lado3T.value)">Calcular</button>' +
                '</form>';
            break;
        case 'cadrado':
            datos.innerHTML =
                '<form>' +
                '<p><label for"ladoCa">¿Cuánto mide el lado en centímetros? </label><input id="ladoCa"></p>' +
                '<button type="button" onclick="perimetroCadrado(ladoCa.value)">Calcular</button>' +
                '</form>';
            break;
        case 'rectangulo':
            datos.innerHTML =
                '<form>' +
                '<p><label for"lado1R">¿Cuánto mide la base en centímetros? </label><input id="lado1R"></p>' +
                '<p><label for"lado2R">¿Cuánto mide la altura en centímetros? </label><input id="lado2R"></p>' +
                '<button type="button" onclick="perimetroRectangulo(lado1R.value, lado2R.value)">Calcular</button>' +
                '</form>';
            break;
        case 'circulo':
            datos.innerHTML =
                '<form>' +
                '<p><label for"radioC">¿Cuánto mide el radio en centímetros? </label><input id="radioC"></p>' +
                '<button type="button" onclick="perimetroCirculo(radioC.value)">Calcular</button>' +
                '</form>';
            break;
        default:
            "Non sei qué figura é esa";
            break;
    }
}

function perimetroTriangulo(ladoA, ladoB, ladoC) {
    var lado1 = parseFloat(ladoA);
    var lado2 = parseFloat(ladoB);
    var lado3 = parseFloat(ladoC);

    var perimetroT = lado1 + lado2 + lado3;
    resultado.innerHTML = "El perímetro del triángulo es " + perimetroT + " cm.";
}

function perimetroCadrado(lado) {
    var ladoCa = parseFloat(lado);

    resultado.innerHTML = "El perímetro del cuadrado es " + (ladoCa * 4) + " cm.";
}

function perimetroRectangulo(base, altura) {
    var baseR = parseFloat(base);
    var alturaR = parseFloat(altura);

    var perimetroR = (baseR * 2) + (alturaR * 2)
    resultado.innerHTML = "El perímetro del rectángulo es " + perimetroR + " cm."
}

function perimetroCirculo(radio) {
    var radioC = parseFloat(radio);

    var perimetroC = 2 * Math.PI * radioC;
    resultado.innerHTML = "El perímetro del círculo es " + perimetroC.toFixed(2) + " cm."
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_5(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Dados dous números, indica cal é o maior.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num1">Introduce el primer número a comparar:</label><input id="num1"></p>' +
        '<p><label for="num2">Introduce el segundo número:</label><input id="num2"></p>' +
        '<p><button type="button" onclick="comparaNumeros(num1.value, num2.value)">Calcular</button></p>' +
        '</form>';
    enunciado.innerHTML = '';
}

function comparaNumeros(num1, num2) {
    var x = parseInt(num1);
    var y = parseInt(num2);

    if (x > y) {
        resultado.innerHTML = x + " es mayor que " + y + ".";
    } else if (x < y) {
        resultado.innerHTML = y + " es mayor que " + x + ".";
    } else {
        resultado.innerHTML = "Los dos números son iguales.";
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_6(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Dados dous números, indica cal é o maior.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num1">Introduce el primer número a comparar:</label><input id="num1"></p>' +
        '<p><label for="num2">Introduce el segundo número:</label><input id="num2"></p>' +
        '<p><button type="button" onclick="comparaNumeros2(num1.value, num2.value)">Calcular</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function comparaNumeros2(num1, num2) {
    var x = parseInt(num1);
    var y = parseInt(num2);

    if (x == y) {
        resultado.innerHTML = "Los dos números son iguales.";
    } else if (x > y) {
        resultado.innerHTML = x + " es más grande que " + y;
    } else {
        resultado.innerHTML = y + " es más grande que " + x;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_7(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Dados dous números, indica cal é o maior.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num1">Introduce el primer número a comparar:</label><input id="num1"></p>' +
        '<p><label for="num2">Introduce el segundo número:</label><input id="num2"></p>' +
        '<p><label for="num3">Introduce el tercer número:</label><input id="num3"></p>' +
        '<p><button type="button" onclick="comparaNumeros3(num1.value, num2.value, num3.value)">Calcular</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function comparaNumeros3(num1, num2, num3) {
    var x = parseInt(num1);
    var y = parseInt(num2);
    var z = parseInt(num3);

    if (x != y && x != z && y != z) {
        if (x > y && x > z) {
            resultado.innerHTML = x + " es mayor.";
        } else if (y > z) {
            resultado.innerHTML = y + " es mayor.";
        } else {
            resultado.innerHTML = z + " es mayor.";
        }
    } else {
        resultado.innerHTML = "Dos o más números son iguales.";
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_8(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Pedir un ano e indicar se é ou non bisesto, " +
        " tendo en conta que son bisestos todos os múltiplos de 4 agás os múltiplos de 100 (por exemplo o 1900 non foi bisesto), " +
        " aínda que os múltiplos de 400 si son bisestos (por iso o foi o ano 2000).";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num">Introduce un año:</label><input id="num"></p>' +
        '<p><button type="button" onclick="esBisiesto(num.value)">Calcular</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function esBisiesto(num) {
    var ano = parseInt(num);

    if (ano >= 1900 && ano <= 2100) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            resultado.innerHTML = "Es año bisiesto.";
        } else {
            resultado.innerHTML = "No es año bisiesto.";
        }
    } else {
        resultado.innerHTML = "Incorrecto. Introduce un año entre 1900 y 2100."
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_9(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Pedir un ano e indicar qué competición de seleccións masculinas de balonmán se disputa ese ano, " +
        "tendo en conta que os anos múltiplos de 4 celébranse Xogos Olímpicos, os impares hai Mundiais e os pares Campionatos de Europa.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="anoC">Introduce un año:</label><input id="anoC"></p>' +
        '<p><button type="button" onclick="anoCompeticion(anoC.value)">Consultar competiciones</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function anoCompeticion(ano) {
    var anoC = parseInt(ano);

    if (anoC % 4 == 0 && anoC % 2 == 0) {
        resultado.innerHTML = "En este año se celebran Juegos Olímpicos y Campeonatos de Europa de balonmano.";
    } else if (ano % 4 != 0 && ano % 2 == 0) {
        resultado.innerHTML = "En este año sólo se celebran Campeonatos de Europa.";
    } else if (ano % 4 == 0 && ano % 2 != 0) {
        resultado.innerHTML = "En este año sólo se celebran Juegos Olímpicos.";
    } else {
        resultado.innerHTML = "En este año sólo se celebran Mundiales de balonmano.";
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_10(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Pedir un número do 1 ao 5 e indicar se é primo ou non.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="numP">Introduce un número:</label><input id="numP"></p>' +
        '<p><button type="button" onclick="esPrimo(numP.value)">Calcular</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function esPrimo(num) {
    var numPrimo = parseInt(num);

    if (numPrimo >= 1 && numPrimo <= 5) {
        if (numPrimo % 2 == 0) {
            resultado.innerHTML = num + " es primo.";
        } else {
            resultado.innerHTML = num + " no es primo.";
        }
    } else {
        resultado.innerHTML = "Trata de introducir un número entre 1 y 5."
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_11(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Pedir un número do 1 ao 7 e amosar que día da semana é.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="numDia">Introduce un número [1-7]:</label><input id="numDia"></p>' +
        '<p><button type="button" onclick="numDiaSemana(numDia.value)">Comprobar día de la semana</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function numDiaSemana(dia) {
    var nDia = parseInt(dia);
    switch (nDia) {
        case 1:
            resultado.innerHTML = "Lunes.";
            break;
        case 2:
            resultado.innerHTML = "Martes.";
            break;
        case 3:
            resultado.innerHTML = "Miércoles.";
            break;
        case 4:
            resultado.innerHTML = "Jueves.";
            break;
        case 5:
            resultado.innerHTML = "Viernes.";
            break;
        case 6:
            resultado.innerHTML = "Sábado.";
            break;
        case 7:
            resultado.innerHTML = "Domingo.";
            break;
        default:
            resultado.innerHTML = "Dato incorrecto. Introduce un número entro 1 y 7.";
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_12(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Pedir unha letra e detectar se é ou non vogal.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="letra">Escribe una letra:</label><input id="letra"></p>' +
        '<p><button type="button" onclick="comprobarLetra(letra.value)">Comprobar</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function comprobarLetra(caracter) {
    var vocal = caracter.toLowerCase();
    if (isNaN(vocal)) {
        if (vocal === 'a' || vocal === 'e' || vocal === 'i' || vocal === 'o' || vocal === 'u') {
            resultado.innerHTML = "La letra introducida es vocal.";
        } else {
            resultado.innerHTML = "La letra introducida es consonante.";
        }
    } else {
        resultado.innerHTML = "No has introducido una letra. Vuelve a intentarlo."
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_13(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Introducir tres números e detectar se se meteron en orde crecente.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num1">Introuce el primer número:</label><input id="num1"></p>' +
        '<p><label for="num2">Introduce el segundo número:</label><input id="num2"></p>' +
        '<p><label for="num3">Introduce el tercer número:</label><input id="num3"></p>' +
        '<button type="button" onclick="comprobarOrden(num1.value, num2.value, num3.value)">Verificar orden de entrada</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function comprobarOrden(numA, numB, numC) {
    var a = parseInt(numA);
    var b = parseInt(numB);
    var c = parseInt(numC);

    if (isNaN(a) || isNaN(b) || (isNaN(c))) {
        resultado.innerHTML = "Alguno de los números introducidos no es un número. Vuelve a introducirlos.";
    } else {
        if (a < b && b < c) {
            resultado.innerHTML = "Los números se han introducido en orden creciente.";
        } else if (a < b && b > c) {
            resultado.innerHTML = "Los números no se han introducido en orden creciente. " + b + " es mayor que " + c + ".";
        } else if (a > b && b < c) {
            resultado.innerHTML = "Los números no se han introducido en orden creciente. " + a + " es mayor que " + b + ".";
        } else {
            resultado.innerHTML = "Los números no se han introducido en orden creciente. " + a + " es mayor que " + b + " y que " + c + ".";
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_14(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Escribir un programa que pida a hora no formato HH:MM:SS e indique a hora no segundo seguinte.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="hora">Introduce una cantidad de tiempo en segundos:</label><input id="hora"></p>' +
        '<p><button type="button" onclick="calcularHora(hora.value)">Calcular tiempo</button></p>' +
        '</form>';
    resultado.innerHTML = '';
}

function calcularHora(tiempo) {
    var segundos = parseFloat(tiempo);

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_15(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Programa que pida 3 números e os amose de menor a maior ou de maior a menor segundo o pida o usuario.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="num1">Introduce el primer número:</label><input id="num1"></p>' +
        '<p><label for="num2">Introduce el segundo número:</label><input id="num2"></p>' +
        '<p><label for="num3">Introduce el tercer número:</label><input id="num3"></p>' +
        '<p><button type="button" onclick="ordenarNumeros(num1.value, num2.value, num3.value)">Calcular</button></p>' +
        '</form>';
    resultado.innerHTML = "";
}

function ordenarNumeros(numA, numB, numC) {
    var a = parseInt(numA);
    var b = parseInt(numB);
    var c = parseInt(numC);
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function exercicio2_18(opcion) {
    opcionSubmenu_2(opcion, numExercicios);
    enunciado.innerHTML = "Traduce un texto introducido pola emoticona correspondente.";
    datos.innerHTML =
        '<form>' +
        '<p><label for="texto">Introduce un texto:</label><input id="texto"></p>' +
        '<button type="button" onclick="traducirIcono(texto.value)">Traducir</button>' +
        '</form>';
    resultado.innerHTML = "";
}

function traducirIcono(texto) {
    var textoIcono = '';
    switch (texto) {
        case 'chiscadela':
            textoIcono = '<img src=imaxes/emoticonas/chiscadela.png>';
            console.log(textoIcono);
            break;
        case 'enfadado':
            textoIcono = '<img src="imaxes/emoticonas/enfadado.png">';
            break;
        case 'fresco':
            textoIcono = '<img src="imaxes/emoticonas/fresco.png">';
            break;
        case 'linguaFora':
            textoIcono = '<img src="imaxes/emoticonas/linguaFora.png">';
            break;
        case 'pensativo':
            textoIcono = '<img src="imaxes/emoticonas/pensativo.png">';
            break;
        case 'sorprendido':
            textoIcono = '<img src="imaxes/emoticonas/sorprendido.png">';
            break;
        case 'sorriso':
            textoIcono = '<img src="imaxes/emoticonas/sorriso.png">';
            break;
        case 'sorrisoGrande':
            textoIcono = '<img src="imaxes/emoticonas/sorrisoGrande.png">';
            break;
        case 'triste':
            textoIcono = '<img src="imaxes/emoticonas/triste.png">';
            break;
        default:
            textoIcono = "El texto introducido no se corresponde con ningún icono.";
            break;
    }
    resultado.innerHTML = textoIcono;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////