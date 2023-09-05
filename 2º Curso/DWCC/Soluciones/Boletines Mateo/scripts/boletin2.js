//exercicio1
function exercicio1b2() {

    enunciado.innerHTML = "<br/>Imprimir o valor absoluto dun número dado.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num'>Número: </label> <input id='num'> <br/>" +
        " <button type='button' onclick='resolver1b2(num.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function resolver1b2(num) {
    var texto = "";
    if (isNaN(num)) {
        texto = "Eso non é un número";
    } else {
        var valor = parseFloat(num);
        if (num < 0) {
            num *= -1;
        }
        texto = "Valor absoluto de " + valor + " é " + num;
    }
    solucion.innerHTML = texto;
}

//exercicio2
function exercicio2b2() {

    enunciado.innerHTML = "<br/>Calcular a superficie dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO.<br/><br/>";
    datos.innerHTML = "<form>" +
        "<select id ='selecion' onchange='selecionElexida(selecion.value)'>" +
        "<option selected disabled>Escolle unha figura</option>" +
        "<option>Triángulo</option>" +
        "<option>Cadrado</option>" +
        "<option>Rectángulo</option>" +
        "<option>Círculo</option>" +
        "</select> <br/> </form>";
    solucion.innerHTML = "";
}

function selecionElexida(selecion) {
    var texto = "";
    switch (selecion) {
        case "Triángulo":
        case "Rectángulo":
            texto = "<form>" + "<label for='base'>Base: </label> <input id='base'> <br/>" +
                "<label for='altura'>Altura: </label> <input id='altura'> <br/>" +
                " <button type='button' onclick='calcularArea(\"" + selecion + "\",base.value,altura.value)'>Calcular</button>" + "</form>";
            break;
        case "Cadrado":
        case "Círculo":
            var literal = (selecion == "Cadrado") ? "Lado" : "Radio";
            texto = "<form>" + "<label for='radio'>" + literal + "</label> <input id='radio'> <br/>" +
                " <button type='button' onclick='calcularArea(\"" + selecion + "\",radio.value, radio.value)'>Calcular</button>" + "</form>";
            break;
        default:
            alert('A figura' + selecion + 'non está contemplada');
            break;
    }
    solucion.innerHTML = texto;
}

function calcularArea(selecion, param1, param2) {
    var texto = "";
    if (!isNaN(param1) && !isNaN(param2)) {
        if (param1 <= 0 || param2 <= 0) {
            texto = "Os números introducidos deben ser maiores que 0";
        } else {
            param1 = parseFloat(param1);
            param2 = parseFloat(param2);

            switch (selecion) {
                case "Triángulo":
                    var area = param1 * param2 / 2;
                    break;
                case "Rectángulo":
                    var area = param1 * param2;
                    break;
                case "Cadrado":
                    var area = Math.pow(param1, 2);
                case "Círculo":
                    var area = Math.PI * Math.pow(param1, 2);
                    break;
                default:
                    alert('A figura' + selecion + 'non está contemplada');
                    break;
            }
            texto = "A área do " + selecion + " é de: " + area.toFixed(2);
        }
    } else {
        texto = "Debes introducir números";
    }
    solucion.innerHTML = texto;
}

//exercicio3
function exercicio3b2() {

    enunciado.innerHTML = "<br/>Modifica o programa anterior para que, dadas dúas figuras, indique cal delas ten unha superficie maior.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='triangulo'><input type='checkbox' id='triangulo'>Triángulo</label><br/>" +
        "<label for='cuadrado'><input type='checkbox' id='cuadrado'>Cuadrado</label><br/>" +
        "<label for='rectangulo'><input type='checkbox' id='rectangulo'>Rectángulo</label><br/>" +
        "<label for='circulo'><input type='checkbox' id='circulo'>Círculo</label><br/>" +
        " <button type='button' onclick='figurasEscollidas(triangulo, cuadrado, rectangulo, circulo)'>Escoller</button>" + "</form>";
    solucion.innerHTML = "";

}

function figurasEscollidas(trian, cuad, rect, circ) {
    solucion.innerHTML = "";
    var baseT, alturaT, ladoCuadr, baseR, alturaR, radio;
    if (trian.checked) {
        solucion.innerHTML += "<form>" + "Triángulo <br/>" + "<label for='baseT'>Base: </label> <input id=" + baseT + "> <br/>" +
            "<label for='alturaT'>Altura: </label> <input id=" + alturaT + "> <br/><br/>" + "</form>";
    } else {
        baseT = null;
        alturaT = null;
    }
    if (cuad.checked) {
        solucion.innerHTML += "<form>" + "Cuadrado <br/>" + "<label for='ladoCuadr'>Lado: </label> <input id=" + ladoCuadr + "> <br/><br/>" + "</form>";
    } else {
        ladoCuadr = null;
    }
    if (rect.checked) {
        solucion.innerHTML += "<form>" + "Rectángulo <br/>" + "<label for='baseR'>Base: </label> <input id=" + baseR + "> <br/>" +
            "<label for='alturaR'>Altura: </label> <input id=" + alturaR + "> <br/><br/>" + "</form>";
    } else {
        baseR = null;
        alturaR = null;
    }
    if (circ.checked) {
        solucion.innerHTML += "<form>" + "Círculo <br/>" + "<label for=" + radio + ">Radio: </label> <input id='radio'> <br/><br/>" + "</form>";
    } else {
        radio = null;
    }
    solucion.innerHTML += " <button type='button' onclick='calcularMaiorArea(" + baseT + "," + alturaT + "," + ladoCuadr + "," + baseR + "," + alturaR + "," + radio + ")'>Calcular</button>";
}

function calcularMaiorArea(baseT, alturaT, lado, baseR, alturaR, radio) {
    console.log(baseT, alturaT, lado, baseR, alturaR, radio);
    //Triángulo
    var areaTrian = (parseFloat(baseT) * parseFloat(alturaT)) / 2;
    areaTrian = parseFloat(areaTrian);
    if (isNaN(areaTrian)) {
        areaTrian = 0;
    }
    //Cuadrado
    var areaCuad = parseFloat(lado) * parseFloat(lado);
    areaCuad = parseFloat(areaCuad);
    if (isNaN(areaCuad)) {
        areaCuad = 0;
    }
    //Rectángulo
    var areaRect = parseFloat(baseR) * parseFloat(alturaR);
    areaRect = parseFloat(areaRect);
    if (isNaN(areaRect)) {
        areaRect = 0;
    }
    //Círculo
    var areaCirc = Math.PI * Math.pow(parseFloat(radio), 2);
    areaCirc = parseFloat(areaCirc);
    if (isNaN(areaCirc)) {
        areaCirc = 0;
    }
    console.log(areaCirc, areaRect, areaCuad, areaTrian);
    if (areaTrian > areaCuad && areaTrian > areaRect && areaTrian > areaCirc) {
        solucion2.innerHTML = "O área do triángulo e o maior."
    } else if (areaCuad > areaTrian && areaCuad > areaRect && areaCuad > areaCirc) {
        solucion2.innerHTML = "O área do cadrado e o maior."
    } else if (areaRect > areaTrian && areaRect > areaCuad && areaRect > areaCirc) {
        solucion2.innerHTML = "O área do rectángulo e o maior."
    } else {
        solucion2.innerHTML = "O área do círculo e o maior."
    }
}

//exercicio4
function exercicio4b2() {

    enunciado.innerHTML = "<br/>Calcula o perímetro dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO.<br/><br/>";
    datos.innerHTML = "<form>" + "<select id ='selecion'><option>Triángulo</option> <option>Cuadrado</option> <option>Rectángulo</option> <option>Círculo</option></select> <br/>" +
        " <button type='button' onclick='figuraSelecionada(selecion.value)'>Escoller</button>" + "</form>";
    solucion.innerHTML = "";

}

function figuraSelecionada(selecion) {

    switch (selecion) {
        case "Triángulo":
            solucion.innerHTML = "<form>" + "<label for='lado1'>Lado 1: </label> <input id='lado1'> <br/>" +
                "<label for='lado2'>Lado 2: </label> <input id='lado2'> <br/>" +
                "<label for='lado3'>Lado 3: </label> <input id='lado3'> <br/>" +
                " <button type='button' onclick='calcularPerimetro(lado1.value,lado2.value,lado3.value,,null,null,null,null)'>Calcular</button>" + "</form>";
            break;
        case "Cuadrado":
            solucion.innerHTML = "<form>" + "<label for='ladoCuadr'>Lado: </label> <input id='ladoCuadr'> <br/>" +
                " <button type='button' onclick='calcularPerimetro(null,null,null,ladoCuadr.value,null,null,null)'>Calcular</button>" + "</form>";
            break;
        case "Rectángulo":
            solucion.innerHTML = "<form>" + "<label for='baseR'>Base: </label> <input id='baseR'> <br/>" +
                "<label for='alturaR'>Altura: </label> <input id='alturaR'> <br/>" +
                " <button type='button' onclick='calcularPerimetro(null,null,null,null,baseR.value, alturaR.value,null)'>Calcular</button>" + "</form>";
            break;
        case "Círculo":
            solucion.innerHTML = "<form>" + "<label for='radio'>Radio: </label> <input id='radio'> <br/>" +
                " <button type='button' onclick='calcularPerimetro(null,null,null,null,null,null,radio.value)'>Calcular</button>" + "</form>";
            break;
    }
}

function calcularPerimetro(lado1, lado2, lado3, ladoCuadr, baseR, alturaR, radio) {
    //Triángulo
    var perimetroTriangulo = parseFloat(lado1) + parseFloat(lado2) + parseFloat(lado3);
    if (perimetroTriangulo > 0) {
        solucion2.innerHTML = "Perímetro do triángulo = " + perimetroTriangulo;
    }
    //Cuadrado
    var perimetroCuadrado = parseFloat(ladoCuadr) * 4;
    if (perimetroCuadrado > 0) {
        solucion2.innerHTML = "Perímetro do cuadrado = " + perimetroCuadrado;
    }
    //Rectángulo
    var perimetroRectangulo = parseFloat(baseR) * 2 + parseFloat(alturaR) * 2;
    if (perimetroRectangulo > 0) {
        solucion2.innerHTML = "Perímetro rectángulo = " + perimetroRectangulo;
    }
    //Círculo
    var perimetroCirculo = 2 * Math.PI * parseFloat(radio);
    if (perimetroCirculo > 0) {
        solucion2.innerHTML = "Perímetro do círculo = " + perimetroCirculo;
    }
}

//exercicio5
function exercicio5b2() {

    enunciado.innerHTML = "<br/>Dados dous números, indica cal é o maior.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
        " <button type='button' onclick='calcularMaiorNumeroex5(num1.value, num2.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";
}

function calcularMaiorNumeroex5(num1, num2) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    if (num1 > num2) {
        solucion.innerHTML = "O primeiro número é o maior."
    } else {
        solucion.innerHTML = "O segundo número é o maior."
    }
}

//exercicio6
function exercicio6b2() {

    enunciado.innerHTML = "<br/>Dados dous números, indica cal é o maior.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
        " <button type='button' onclick='calcularMaiorNumeroex6(num1.value, num2.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";
}

function calcularMaiorNumeroex6(num1, num2) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    if (num1 === num2) {
        solucion.innerHTML = "Os dóus números son iguais."
    } else if (num1 > num2) {
        solucion.innerHTML = "O primeiro número é o maior."
    } else {
        solucion.innerHTML = "O segundo número é o maior."
    }
}

//exercicio7
function exercicio7b2() {

    enunciado.innerHTML = "<br/>Dados tres números, indica cal é o maior.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
        "<label for='num3'>Número 3: </label> <input id='num3'> <br/>" +
        " <button type='button' onclick='calcularMaiorNumeroex7(num1.value, num2.value, num3.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";
}

function calcularMaiorNumeroex7(num1, num2, num3) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    num3 = parseFloat(num3);

    if (num1 > num2 && num1 > num3) {
        solucion.innerHTML = "O primeiro número é o maior."
    } else if (num2 > num1 && num2 > num3) {
        solucion.innerHTML = "O segundo número é o maior."
    } else {
        solucion.innerHTML = "O terceiro número é o maior."
    }
}

//exercicio8
function exercicio8b2() {

    enunciado.innerHTML = "<br/>Pedir un ano e indicar se é ou non bisesto, tendo en conta que son bisestos todos os múltiplos de 4 agás os múltiplos de 100 (por exemplo o 1900 non foi bisesto), aínda que os múltiplos de 400 si son bisestos (por iso o foi o ano 2000).<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='ano'>Ano: </label> <input id='ano'> <br/>" +
        " <button type='button' onclick='calcularBisiesto(ano.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";
}

function calcularBisiesto(ano) {
    ano = parseInt(ano);
    if (ano % 4 === 0) {
        if (ano % 100 === 0) {
            if (ano % 400 === 0) {
                solucion.innerHTML = "Este ano é bisiesto";
            } else {
                solucion.innerHTML = "Este ano non é bisiesto";
            }
        } else {
            solucion.innerHTML = "Este ano é bisiesto";
        }
    } else {
        solucion.innerHTML = "Este ano non é bisiesto";
    }
}

//exercicio9
function exercicio9b2() {

    enunciado.innerHTML = "<br/>Pedir un ano e indicar que competición de seleccións masculinas de balonmán se disputa ese ano, tendo en conta que os anos múltiplos de 4 celébranse Xogos Olímpicos, os impares hai Mundiais e os pares Campionatos de Europa.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='ano'>Ano: </label> <input id='ano'> <br/>" +
        " <button type='button' onclick='calcularCompeticions(ano.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularCompeticions(ano) {
    ano = parseInt(ano);
    if (ano % 4 === 0) {
        solucion.innerHTML = "Este ano hai Xogos Olímpicos e Campionato de Europa.";
    }
    if (ano % 2 === 0 && ano % 4 !== 0) {
        solucion.innerHTML = "Este ano hai Campionato de Europa.";
    }
    if (ano % 2 !== 0) {
        solucion.innerHTML = "Este ano hai Mundial.";
    }
}

//exercicio10
function exercicio10b2() {

    enunciado.innerHTML = "<br/>Pedir un número do 1 ao 5 e indicar se é primo ou non.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num'>Número: </label> <input id='num'> <br/>" +
        " <button type='button' onclick='calcularPrimo(num.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularPrimo(num) {
    num = parseInt(num);

    if (num % num === 0 && num % 1 === 0 && num % 2 !== 0) {
        solucion.innerHTML = "Este número é primo";
    } else {
        solucion.innerHTML = "Este número non é primo";
    }
}

//exercicio11
function exercicio11b2() {

    enunciado.innerHTML = "<br/>Pedir un número do 1 ao 7 e amosar que día da semana é.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num'>Número: </label> <input id='num'> <br/>" +
        " <button type='button' onclick='calcularDia(num.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularDia(num) {
    num = parseInt(num);
    switch (num) {
        case 1:
            solucion.innerHTML = "Lunes";
            break;
        case 2:
            solucion.innerHTML = "Martes";
            break;
        case 3:
            solucion.innerHTML = "Miércoles";
            break;
        case 4:
            solucion.innerHTML = "Jueves";
            break;
        case 5:
            solucion.innerHTML = "Viernes";
            break;
        case 6:
            solucion.innerHTML = "Sábado";
            break;
        case 7:
            solucion.innerHTML = "Domingo";
            break;
    }
}

//exercicio12
function exercicio12b2() {

    enunciado.innerHTML = "<br/>Pedir unha letra e detectar se é ou non vogal.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='letra'>Letra: </label> <input id='letra'> <br/>" +
        " <button type='button' onclick='calcularVogal(letra.value)'>Enviar</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularVogal(letra) {
    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
        solucion.innerHTML = "Vogal";
    } else {
        solucion.innerHTML = "Consoante";
    }
}

//exercicio13
function exercicio13b2() {

    enunciado.innerHTML = "<br/>Introducir tres números e detectar se se meteron en orde crecente.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
        "<label for='num3'>Número 3: </label> <input id='num3'> <br/>" +
        " <button type='button' onclick='calcularMaiorNumeroex13(num1.value, num2.value, num3.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularMaiorNumeroex13(num1, num2, num3) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    num3 = parseFloat(num3);

    if (num3 > num2 && num2 > num1) {
        solucion.innerHTML = "Os números foron introducidos de forma crecente.";
    } else {
        solucion.innerHTML = "Os números non foron introducidos de forma crecente.";
    }
}

//exercicio14
function exercicio14b2() {
    enunciado.innerHTML = "<br/>Escribir un programa que pida a hora no formato HH:MM:SS e indique a hora no segundo seguinte.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='hora'>Hora: </label> <input id='hora'> <br/>" +
        " <button type='button' onclick='calcularHoraSeguinte(hora.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularHoraSeguinte(hora) {
    var horas = hora.charAt(0) + hora.charAt(1);
    var minutos = hora.charAt(3) + hora.charAt(4);
    var segundos = hora.charAt(6) + hora.charAt(7);
    horas = parseInt(horas);
    minutos = parseInt(minutos);
    segundos = parseInt(segundos);
    segundos += 1;

    if (segundos >= 60) {
        segundos = 0;
        minutos += 1;
    }
    if (minutos >= 60) {
        minutos = 0;
        horas += 1;
    }

    if (horas < 10) {
        horas = '0' + horas;
    }
    if (minutos < 10) {
        minutos = '0' + minutos;
    }
    if (horas < 10) {
        segundos = '0' + segundos;
    }
    solucion.innerHTML = horas + ":" + minutos + ":" + segundos;
}

//exercicio15
function exercicio15b2() {
    enunciado.innerHTML = "<br/>Programa que pida 3 números e os amose de menor a maior ou de maior a menor segundo o pida o usuario.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='num1'>Número 1: </label> <input id='num1'> <br/>" +
        "<label for='num2'>Número 2: </label> <input id='num2'> <br/>" +
        "<label for='num3'>Número 3: </label> <input id='num3'> <br/>" +
        " <button type='button' onclick='calcularMenorMaior(num1.value, num2.value, num3.value)'>Calcular de menor a maior</button>" +
        " <button type='button' onclick='calcularMaiorMenor(num1.value, num2.value, num3.value)'>Calcular de maior a menor</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularMaiorMenor(num1, num2, num3) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    num3 = parseFloat(num3);
    var temp;

    if (num1 > num2 && num2 > num3) {
        if (num2 > num3) {
            temp = num1 + ", " + num2 + ", " + num3;
        } else {
            temp = num1 + ", " + num3 + ", " + num2;
        }
    }

    if (num2 > num1 && num2 > num1) {
        if (num1 > num3) {
            temp = num2 + ", " + num1 + ", " + num3;
        } else {
            temp = num2 + ", " + num3 + ", " + num1;
        }
    }

    if (num3 > num2 && num3 > num1) {
        if (num2 > num1) {
            temp = num3 + ", " + num2 + ", " + num1;
        } else {
            temp = num3 + ", " + num1 + ", " + num2;
        }
    }

    solucion.innerHTML = temp;
}

function calcularMenorMaior(num1, num2, num3) {
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    num3 = parseFloat(num3);

    var temp;

    if (num1 < num2 && num2 < num3) {
        if (num2 < num3) {
            temp = num1 + ", " + num2 + ", " + num3;
        } else {
            temp = num1 + ", " + num3 + ", " + num2;
        }
    }

    if (num2 < num1 && num2 < num1) {
        if (num1 < num3) {
            temp = num2 + ", " + num1 + ", " + num3;
        } else {
            temp = num2 + ", " + num3 + ", " + num1;
        }
    }

    if (num3 < num2 && num3 < num1) {
        if (num2 < num1) {
            temp = num3 + ", " + num2 + ", " + num1;
        } else {
            temp = num3 + ", " + num1 + ", " + num2;
        }
    }

    solucion.innerHTML = temp;
}

//exercicio16
function exercicio16b2() {
    enunciado.innerHTML = "<br/>Un xogador de balonmán lesionouse no ligamento cruzado anterior do xeonllo e quere saber cando poderá volver xogar. Realiza un programa que pida ao usuario a data da operación e amose por pantalla o nome do mes no que o xogador estará recuperado.<br/><br/>";
    datos.innerHTML = "<form>" + "<label for='dataOperacion'>Data da operación: </label> <input id='dataOperacion'> <br/>" +
        " <button type='button' onclick='calcularRecuperación(dataOperacion.value)'>Calcular</button>" + "</form>";
    solucion.innerHTML = "";

}

function calcularRecuperación(dataOperacion) {
    switch (parseInt(dataOperacion)) {
        case 1:
            solucion.innerHTML = "Estará recuperado en Xuño";
            break;
        case 2:
            solucion.innerHTML = "Estará recuperado en Xullo";
            break;
        case 3:
            solucion.innerHTML = "Estará recuperado en Agosto";
            break;
        case 4:
            solucion.innerHTML = "Estará recuperado en Setembro";
            break;
        case 5:
            solucion.innerHTML = "Estará recuperado en Outubro";
            break;
        case 6:
            solucion.innerHTML = "Estará recuperado en Novembro";
            break;
        case 7:
            solucion.innerHTML = "Estará recuperado en Decembro";
            break;
        case 8:
            solucion.innerHTML = "Estará recuperado en Xaneiro do ano que ven";
            break;
        case 9:
            solucion.innerHTML = "Estará recuperado en Febreiro do ano que ven";
            break;
        case 10:
            solucion.innerHTML = "Estará recuperado en Marzo do ano que ven";
            break;
        case 11:
            solucion.innerHTML = "Estará recuperado en Abril do ano que ven";
            break;
        case 12:
            solucion.innerHTML = "Estará recuperado en Maio do ano que ven";
            break;
    }
}