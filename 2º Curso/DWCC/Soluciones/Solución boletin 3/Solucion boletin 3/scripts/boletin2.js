var primeiraVez = true;
var area;
var contador = 0;
var anterior;
var numeros;

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
	exercicio17.classList.remove("activo");
	exercicio18.classList.remove("activo");
	switch(opcion) {
		case 1: exercicio1.classList.add("activo"); break;
		case 2: exercicio2.classList.add("activo"); break;
		case 3: exercicio3.classList.add("activo"); break;
		case 4: exercicio4.classList.add("activo"); break;
		case 5: exercicio5.classList.add("activo"); break;
		case 6: exercicio6.classList.add("activo"); break;
		case 7: exercicio7.classList.add("activo"); break;
		case 8: exercicio8.classList.add("activo"); break;
		case 9: exercicio9.classList.add("activo"); break;
		case 10: exercicio10.classList.add("activo"); break;
		case 11: exercicio11.classList.add("activo"); break;
		case 12: exercicio12.classList.add("activo"); break;
		case 13: exercicio13.classList.add("activo"); break;
		case 14: exercicio14.classList.add("activo"); break;
		case 15: exercicio15.classList.add("activo"); break;
		case 16: exercicio16.classList.add("activo"); break;
		case 17: exercicio17.classList.add("activo"); break;
		case 18: exercicio18.classList.add("activo"); break;
		default: break;
	}	
}

function exercicio_2_1(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Imprimir o valor absoluto dun número dado';
    datos.innerHTML = 
        'Número <input id="varA" type="text"/>' +
        '<button type="button" onClick="resolver_2_1(varA.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_1(varA) {
    if (!isNaN(varA)) {
        var a = parseFloat(varA);
        if (a < 0) {
            a = a * -1;
        } 
    } else {
        a = 'Debes introducir un número';
    }
	amosarResultado(a);
}

function exercicio_2_2(){
	opcionSubmenu_2(2); 
	enunciado.textContent = 'Calcular a superficie dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO';
	datos.innerHTML = 
        '<select id="figura" onChange="resolver_2_2(figura.value,\'2\')">' +
        '   <option selected disabled>Debes premer nunha das figuras</option>' +
        '   <option value="triángulo">Triángulo</option>' +
        '   <option value="cadrado">Cadrado</option>' +
        '   <option value="rectángulo">Rectángulo</option>' +
        '   <option value="círculo">Círculo</option>' +
        '</select>';
 	resultado.textContent = '';
}

function resolver_2_2(figura,opcion){
   switch (figura) {
		case 'triángulo':    
		case 'rectángulo':
			datos.innerHTML = 
				'Base <input id="base" type="text"/>' +
				'Altura <input id="altura" type="text"/>' +
				'<button type="button" onClick="calcular(\'' + opcion + '\',\'' + figura + '\',base.value,altura.value);">Premer</button>';   
            break;
        case 'cadrado': 
        case 'círculo':
            literal = (figura == 'cadrado') ? 'Lado' : 'Radio'; 
            datos.innerHTML = 
                literal + ' <input id="dato" type="text"/>' +
                '<button type="button" onClick="calcular(\'' + opcion + '\',\'' + figura + '\',dato.value,\'1\');">Premer</button>';
            break;
        default:
            alert('Non sei calcular a área desa figura');
    }	
}

function calcular(opcion,figura,base,altura) {console.log(opcion,figura,base,altura)
	if (opcion == 2){
		area = calcularArea(figura,base,altura);
		amosarResultado(area);
	} else {
		if (primeiraVez) {
			area = calcularArea(figura,base,altura);
			primeiraVez = false;
			exercicio_2_3();
		} else {
			compararAreas(area,calcularArea(figura,base,altura));
		}
	}	
}

function calcularArea(figura,base,altura) {
	if (!isNaN(base) && !isNaN(altura)) {	
		if ((base <= 0) || (altura <= 0)) {	
    		area = 'Os datos non poden ser menores que 0';
    	} else {	
    		switch (figura) {
      		case 'triángulo': var area = (base * altura) / 2; break;     
        		case 'rectángulo': var area = base * altura; break;
        		case 'cadrado': var area = base * base; break;
        		case 'círculo': var area = Math.PI * base * base; break;
        		default: alert('Non sei calcular a área desa figura');
    		}
		}
   } else {
		area = 'Os datos son incorrectos';	
	}	  
 	return area;	
}

function exercicio_2_3(){
	opcionSubmenu_2(3);
	enunciado.textContent = 'Modifica o programa anterior para que, dadas dúas figuras, indique cal delas ten unha superficie maior';
	datos.innerHTML = 
        '<select id="figura" onChange="resolver_2_2(figura.value,\'3\')">' +
        '   <option selected disabled>Debes premer nunha das figuras</option>' +
        '   <option value="triángulo">Triángulo</option>' +
        '   <option value="cadrado">Cadrado</option>' +
        '   <option value="rectángulo">Rectángulo</option>' +
        '   <option value="círculo">Círculo</option>' +
        '</select>';
 	resultado.textContent = '';
}


function compararAreas(area1,area2){
	var texto = '';
	if (area1 > area2) {
		texto = 'A área da primeira figura é maior que a área da segunda';
	} else {
		texto = 'A área da segunda figura é maior que a área da primeira';
	}
	amosarResultado(texto);
	primeiraVez = true;
	area = 0;				
}	

function exercicio_2_4(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Calcula o perímetro dunha figura xeométrica. A figura só pode ser TRIÁNGULO, CADRADO, RECTÁNGULO ou CÍRCULO';
    datos.innerHTML = 
        '<select id="figura">' +
        '   <option>Triángulo</option>' +
        '   <option>Cadrado</option>' +
        '   <option>Rectángulo</option>' +
        '   <option>Círculo</option>' +
        '</select>' +
        '<button type="button" onClick="resolver_2_4(figura.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_4(figura) {
    switch (figura) {
        case 'Triángulo':
            datos.innerHTML = 
                'Lado 1 <input id="lado1" type="text"/>' +
                'Lado 2 <input id="lado2" type="text"/>' +
                'Lado 3 <input id="lado3" type="text"/>' +           
                '<button type="button" onClick="perimetro(\'' + figura + '\',lado1.value,lado2.value,lado3.value);">Premer</button>';    
            break;
        case 'Rectángulo':
            datos.innerHTML = 
                'Base <input id="base" type="text"/>' +
                'Altura <input id="altura" type="text"/>' +
                '<button type="button" onClick="perimetro(\'' + figura + '\',base.value,altura.value,\'0\');">Premer</button>';    
            break;
        case 'Cadrado': 
            datos.innerHTML = 
                'Lado <input id="lado" type="text"/>' +
                '<button type="button" onClick="perimetro(\'' + figura + '\',lado.value,\'0\',\'0\');">Premer</button>';    
            break;
        case 'Círculo':
            datos.innerHTML = 
                'Radio <input id="dato" type="text"/>' +
                '<button type="button" onClick="perimetro(\'' + figura + '\',dato.value,\'0\',\'0\');">Premer</button>';
            break;
        default:
            alert('Non sei calcular a área desa figura');
    }  
}

function perimetro(figura,base,altura,lado) {
    if (!isNaN(base) && !isNaN(altura) && !isNaN(lado)) {    
        var perimetro = calcularPerimetro(figura,base,altura,lado);
        if (isNaN(perimetro)) {
            var texto = 'Os datos introducidos NON forman un triángulo';
        } else {
            var texto = 'O perímetro da figura é: ' + perimetro.toFixed(2); 
        }
    } else {
        texto = 'Entrada inválida';
    }
    amosarResultado(texto);
}

function calcularPerimetro(figura,base,altura,lado) {
    base = parseFloat(base);
    altura = parseFloat(altura);
    lado = parseFloat(lado);
    var perimetro;
    switch (figura) {
        case 'Triángulo': 
            perimetro = base + altura + lado; 
            if ((base >= altura + lado) || 
                (altura >= base + lado) ||
                (lado >= altura + base)) {
                perimetro = 'Non é triángulo';
            }
            break;   
        case 'Rectángulo': perimetro = (base + altura) * 2; break;
        case 'Cadrado': perimetro = base * 4; break;
        case 'Círculo': perimetro = 2 * Math.PI * base; break;
        default:
            alert('Non sei calcular a área desa figura');
    }    
    return perimetro;
}

function exercicio_2_5(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Dados dous números, indica cal é o maior';
    datos.innerHTML = 
        '1º número <input id="numero1" type="text"/>' +
        '2º número <input id="numero2" type="text"/>' +
        '<button type="button" onClick="maior(numero1.value,numero2.value);">Premer</button>';
    resultado.textContent = '';
}

function maior(numero1,numero2) {
    if (!isNaN(numero1) && !isNaN(numero2)) {    
        var maior = calcularMaior(numero1,numero2);
        texto = 'O número maior é o ' + maior;
    } else {
        texto = 'Entrada inválida';        
    }
    amosarResultado(texto);
}

function calcularMaior(numero1,numero2) {
    numero1 = parseFloat(numero1);
    numero2 = parseFloat(numero2);
    return (numero1 > numero2) ? numero1 : numero2;        
}

function exercicio_2_6(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Determinar se dous números son iguais ou diferentes, e se son diferentes indicar cal deles é maior';
    datos.innerHTML = 
        '1º número <input id="numero1" type="text"/>' +
        '2º número <input id="numero2" type="text"/>' +
        '<button type="button" onClick="resolver_2_6(numero1.value,numero2.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_6(varA,varB) {
    var texto = 'Entrada inválida';
    if (!isNaN(varA) && !isNaN(varB)) {    
        varA = parseFloat(varA);
        varB = parseFloat(varB);
        if (varA > varB) {
            texto = "O primeiro número é maior";
        } else if (varA < varB) {
            texto = "O segundo número é maior";
        } else {
            texto = "Os dous números son iguais";
        }
    }
    amosarResultado(texto);
}

function exercicio_2_7(opcion) {
	opcionSubmenu_2(opcion);
    contador++;
    enunciado.textContent = 'Dados tres números, indica cal é o maior';
    datos.innerHTML = 
        contador + 'º número <input id="numero" type="text"/>' +
        '<button type="button" onClick="resolver_2_7(numero.value,' + opcion + ');">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_7(numero,opcion) {
    var texto = 'Entrada inválida';
    if (!isNaN(numero)) {     
        if (contador == 1) { anterior = numero; }
        anterior = calcularMaior(numero,anterior);
        if (contador < 3) { exercicio_2_7(opcion); }
        else {
            contador = 0;
            amosarResultado('O número maior é o: ' + anterior); 
        }
    } else {
        contador = 0;
        amosarResultado(texto);
    }
}

function exercicio_2_8(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Pedir un ano e indicar se é ou non bisesto, tendo en conta que son bisestos todos os múltiplos de 4 agás os múltiplos de 100 (por exemplo o 1900 non foi bisesto), aínda que os múltiplos de 400 si son bisestos (por iso o foi o ano 2000)';
    datos.innerHTML = 
        'ANO: <input id="ano" type="text"/>' +
        '<button type="button" onClick="resolver_2_8(ano.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_8(ano) {
	var texto = 'Entrada inválida';
    if (!isNaN(ano)) {     
		ano = parseInt(ano);
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) { texto = "O ano " + ano + " é bisesto"; }
		else { texto = "O ano " + ano + " NON é bisesto"; }
    } 	
	amosarResultado(texto);
}

function exercicio_2_9(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Pedir un ano e indicar que competición de seleccións masculinas de balonmán se disputa ese ano, tendo en conta que os anos múltiplos de 4 celébranse Xogos Olímpicos, os impares hai Mundiais e os pares Campionatos de Europa';
    datos.innerHTML = 
        'ANO: <input id="ano" type="text"/>' +
        '<button type="button" onClick="resolver_2_9(ano.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_9(ano) {
	var texto = 'Entrada inválida';
    if (!isNaN(ano)) { 	
		ano = parseInt(ano);
		texto = "O ano " + ano + " celébrase ";
		if (ano % 2 == 0) { texto += "o Campionato de Europa"; }
		else { texto += "o Mundial"; }
		if (ano % 4 == 0) { texto += " e os Xogos Olímpicos"; }
	}	
	amosarResultado(texto);
}

function exercicio_2_10(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Pedir un número do 1 ao 5 e indicar se é primo ou non';
    datos.innerHTML = 
        'Número do 1 ao 5: <input id="numero" type="text"/>' +
        '<button type="button" onClick="resolver_2_10(numero.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_10(numero) {
	var texto = 'Entrada inválida';
    if (!isNaN(numero)) {
		numero = parseInt(numero);
		switch (true) {
			case (numero < 1):
			case (numero > 5): texto = 'Debes introducir un número entre o 1 e o 5'; break;
			case (numero == 4): texto = 'O número 4 NON é primo'; break;
			default: texto = 'O número ' + numero + ' é primo'; 
		}
	}	
	amosarResultado(texto);
}

function exercicio_2_11(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Pedir un número do 1 ao 7 e amosar que día da semana é';
    datos.innerHTML = 
        'Número do 1 ao 7: <input id="numero" type="text"/>' +
        '<button type="button" onClick="resolver_2_11(numero.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_11(numero) {
	var texto = 'Entrada inválida';
    if (!isNaN(numero)) {
		numero = parseInt(numero);
		switch (true) {
			case (numero == 1): texto = 'Luns'; break;
			case (numero == 2): texto = 'Martes'; break;
			case (numero == 3): texto = 'Mércores'; break;
			case (numero == 4): texto = 'Xoves'; break;
			case (numero == 5): texto = 'Venres'; break;
			case (numero == 6): texto = 'Sábado'; break;
			case (numero == 7): texto = 'Domingo'; break;
			default: texto = 'Debes introducir un número entre o 1 e o 7'; 
		}
	}	
	amosarResultado(texto);
}

function exercicio_2_12(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Pedir unha letra e detectar se é ou non vogal';
    datos.innerHTML = 
        'Letra: <input id="letra" type="text"/>' +
        '<button type="button" onClick="resolver_2_12(letra.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_12(letra) {
	letra = letra.toLowerCase();
	switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': 		
		case 'á':
		case 'é':
		case 'í':
		case 'ó':
		case 'ú': 	
		case 'ü': texto = 'O carácter introducido é unha vogal'; break;		
		default: texto = 'O carácter introducido NON é unha vogal'; 
	}
	amosarResultado(texto);
}

function exercicio_2_13(opcion) {
	opcionSubmenu_2(opcion);
    contador++;
    enunciado.textContent = 'Introducir tres números e detectar se se meteron en orde crecente';
    datos.innerHTML = 
        contador + 'º número <input id="numero" type="text"/>' +
        '<button type="button" onClick="resolver_2_13(numero.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_13(numero) {
    var texto = 'Entrada inválida';
	var crecente = true;
    if (!isNaN(numero)) {     
        if (contador == 1) { anterior = numero; }
        crecente = crecente && (anterior <= numero);
		anterior = numero;
        if (contador < 3) { exercicio_2_13(13); }
        else {
            contador = 0;
			if (crecente) { texto = 'Os números foron introducidos en orde crecente'; }
			else { texto = 'Os números NON foron introducidos en orde crecente'; }
            amosarResultado(texto); 
        }
    } else {
        contador = 0;
        amosarResultado(texto);
    }
}

function exercicio_2_14(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Escribir un programa que pida a hora no formato HH:MM:SS e indique a hora no segundo seguinte';
    datos.innerHTML = 
        'Hora (HH:MM:SS): <input id="hora" type="text"/>' +
        '<button type="button" onClick="resolver_2_14(hora.value);">Premer</button>';
    resultado.textContent = '';
}

function resolver_2_14(hora) {
	var texto = 'Entrada inválida';
	if (validarHora(hora)) {
		var minutosCero = true;
        var segundos = parseInt(hora.substr(6,2));
        var minutos = parseInt(hora.substr(3,2));
        var horas = parseInt(hora.substr(0,2));
		if (minutos != 0) { minutosCero = false; }
        segundos = (segundos + 1) % 60;
        segundos = (segundos < 9) ? '0' + segundos : segundos;
        if (segundos == '00') { minutos++; }
        minutos = minutos % 60;
        minutos = (minutos < 9) ? '0' + minutos : minutos;
        if (minutos == '00' && !minutosCero) { horas++; }
        horas = horas % 24;
        horas = (horas < 9) ? '0' + horas : horas;        
		texto = horas + ':' + minutos + ':' + segundos;
	}  
	amosarResultado(texto);
}

function validarHora(hora) {
    var patron = /(0\d|1\d|2[0-3]):([0-5]\d):([0-5]\d)/;
    if (!patron.test(hora)) return false;
	else return true;
}

function exercicio_2_15(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Programa que pida 3 números e os amose de menor a maior ou de maior a menor segundo o pida o usuario';
	datos.innerHTML = 
        'Número 1: <input type="text" id="numero1">' +
        'Número 2: <input type="text" id="numero2">' +
        'Número 3: <input type="text" id="numero3">' +
        '<button type="button" onclick="resolver_2_15(1,numero1.value,numero2.value,numero3.value);">Crecente</button>' +
        '<button type="button" onclick="resolver_2_15(0,numero1.value,numero2.value,numero3.value);">Decrecente</button>'; 
    resultado.textContent = '';
}

function resolver_2_15(crecente,numero1,numero2,numero3) {
	var texto = 'Entrada inválida';
	if (!(isNaN(numero1) || isNaN(numero2) || isNaN(numero3))) {
		numero1 = parseFloat(numero1);
		numero2 = parseFloat(numero2);
		numero3 = parseFloat(numero3);
		var auxiliar = '';
		// Vamos ordenar os tres números de forma crecente. Posibles casos:
		switch (true) {
			// caso 1: 1 < 2 < 3 --> xa están ordenados, non hai que facer nada
			// caso 2: 1 < 3 > 2 --> intercambiar o '3' e o '2'
			case (numero1 <= numero2 && numero1 <= numero3 && numero2 >= numero3):
				auxiliar = numero2;
				numero2 = numero3;
				numero3 = auxiliar;
				break;
			// caso 3: 2 > 1 < 3 --> intercambiar o '2' e o '1'
			case (numero1 >= numero2 && numero1 <= numero3 && numero2 <= numero3):
				auxiliar = numero1;
				numero1 = numero2;
				numero2 = auxiliar;
				break;
			// caso 4: 2 < 3 > 1 --> intercambiar o '3' e o '1' e despois o '2' e o '1'
			case (numero1 <= numero2 && numero1 >= numero3 && numero2 >= numero3):
				auxiliar = numero1;
				numero1 = numero3;
				numero3 = numero2;
				numero2 = auxiliar;
				break;
			// caso 5: 3 > 1 < 2 --> intercambiar o '3' e o '1' e despois o '3' e o '2'
			case (numero1 >= numero2 && numero1 >= numero3 && numero2 <= numero3):
				auxiliar = numero1;
				numero1 = numero2;
				numero2 = numero3;
				numero3 = auxiliar;
				break;
			// caso 6: 3 > 2 > 1 --> intercambiar o '3' e o '2', despois o '3' e o '1' e por último o '2' e o '1'
			case (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3):
				auxiliar = numero1;
				numero1 = numero3;
				numero3 = auxiliar;
				break;
			default: break;
		}

		texto = (crecente) ? numero1 + ' ' + numero2 + ' ' + numero3 : numero3 + ' ' + numero2 + ' ' + numero1;   
	}
	amosarResultado(texto);
} 

function exercicio_2_16(opcion) {
	opcionSubmenu_2(opcion);
    enunciado.textContent = 'Un xogador de balonmán lesionouse no ligamento cruzado anterior do xeonllo e quere saber cando poderá volver xogar. Realiza un programa que pida ao usuario a data da operación e amose por pantalla o nome do mes no que o xogador estará recuperado. Debemos ter en conta que a recuperación da rotura do ligamento cruzado anterior varía entre 4 e 6 meses dende que se realiza a operación, polo que consideraremos 5 meses para indicar en que mes estará recuperado o xogador';
	datos.innerHTML = 
        '<p>Data da operación:</p>' +
		'<p><label>Día: </label>' +
			'<select>' +
				'<option value="1">1</option>' +
				'<option value="2">2</option>' +
				'<option value="3">3</option>' +
				'<option value="4">4</option>' +
				'<option value="5">5</option>' +
				'<option value="6">6</option>' +
				'<option value="7">7</option>' +
				'<option value="8">8</option>' +
				'<option value="9">9</option>' +
				'<option value="10">10</option>' +
				'<option value="11">11</option>' +
				'<option value="12">12</option>' +
				'<option value="13">13</option>' +
				'<option value="14">14</option>' +
				'<option value="15">15</option>' +
				'<option value="16">16</option>' +
				'<option value="17">17</option>' +
				'<option value="18">18</option>' +
				'<option value="19">19</option>' +
				'<option value="20">20</option>' +
				'<option value="21">21</option>' +
				'<option value="22">22</option>' +
				'<option value="23">23</option>' +
				'<option value="24">24</option>' +
				'<option value="25">25</option>' +
				'<option value="26">26</option>' +
				'<option value="27">27</option>' +
				'<option value="28">28</option>' +
				'<option value="29">29</option>' +
				'<option value="30">30</option>' +
				'<option value="31">31</option>' +
			'</select>' +
			'<label>  Mes: </label>' +
			'<select name="mes" id="mes">' +
				'<option value="1">Xaneiro</option>' +
				'<option value="2">Febreiro</option>' +
				'<option value="3">Marzo</option>' +
				'<option value="4">Abril</option>' +
				'<option value="5">Maio</option>' +
				'<option value="6">Xuño</option>' +
				'<option value="7">Xullo</option>' +
				'<option value="8">Agosto</option>' +
				'<option value="9">Setembro</option>' +
				'<option value="10">Outubro</option>' +
				'<option value="11">Novembro</option>' +
				'<option value="12">Decembro</option>' +
			'</select>' +
			'<label>  Ano: </label>' + 
			'<select>' +
				'<option value="2017">2017</option>' +
				'<option value="2018">2018</option>' +
				'<option value="2019">2019</option>' +							
			'</select></p>' +
		'<p><button onclick="resolver_2_16(mes.value);">Calcular mes de recuperación</button></p>'; 
    resultado.textContent = '';
}

function resolver_2_16(mes) {
	mes = parseInt(mes);
	var texto = 'O mes de recuperación estimado é ';

	switch (mes) {
		case 1: texto += 'xuño'; break;
		case 2: texto += 'xullo'; break;
		case 3: texto += 'agosto'; break;
		case 4: texto += 'setembro'; break;
		case 5: texto += 'outubro'; break;
		case 6: texto += 'novembro'; break;
		case 7: texto += 'decembro'; break;
		case 8: texto += 'xaneiro'; break;
		case 9: texto += 'febreiro'; break;
		case 10: texto += 'marzo'; break;
		case 11: texto += 'abril'; break;
		case 12: texto += 'maio'; break;
		default: texto = 'Mes non calculable';
	}

	amosarResultado(texto);
} 

function exercicio_2_17(opcion) {
	opcionSubmenu_2(opcion);
	enunciado.innerHTML = 
		'<p>O exercicio 17 está resolto aparte</p>';
	datos.innerHTML = '';
 	resultado.textContent = '';
}

function exercicio_2_18(opcion){
	opcionSubmenu_2(opcion);
	enunciado.innerHTML = 
		'<p>Traduce un texto introducido pola emoticona correspondente</p>';
	datos.innerHTML = 
		'<form id="form1">' +
			'<p><label for="texto">Texto a traducir: </label><input id="texto"/></p>' +
			'<p><button type="button" onclick="resolver_2_18(texto.value)">Traducir</button></p>' +
		"</form>";
 	resultado.textContent = '';
}

function resolver_2_18(texto){
	switch (texto) {
		case ':-)': 
		case ':)': imaxe = 'sorriso'; break;
		case ':-D': imaxe = 'sorrisoGrande'; break;
		case ';-)': imaxe = 'chiscadela'; break;
		case 'V-.': imaxe = 'pensativo'; break;
		case ':-P': 
		case ':-p': imaxe = 'linguaFora'; break;
		case 'B-)': imaxe = 'fresco'; break;
		case ':-(': 
		case ':(': imaxe = 'triste'; break;
		case '8-o': imaxe = 'sorprendido'; break;
		case '8-[': 
		case '(grr)': imaxe = 'enfadado'; break;
		default : imaxe = 'nonExiste'; break; 
	}	
	if (imaxe == 'nonExiste') { texto = 'Non existe unha emoticona asociada a eses caracteres'; }
	else { texto = '<img class="emoticona" src="./imaxes/emoticonas/' + imaxe + '.png">'; }
	resultado.innerHTML = texto;	
}
