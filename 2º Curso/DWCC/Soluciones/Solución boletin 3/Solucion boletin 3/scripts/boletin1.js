function opcionSubmenu_1(opcion) {
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
		default: break;
	}	
}

function exercicio_1_1(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Suma de dous números e impresión do resultado';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Primeiro número <input id="varA" type="text"/>' +
        '    Segundo número <input id="varB" type="text"/>' +
        '    <button type="button" onClick="resolver_1_1(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_1(varA, varB) {
	var a = parseFloat(varA.value);
	var b = parseFloat(varB.value);
	var suma = (a + b);
	resultado.textContent = suma.toFixed(2);
}

function exercicio_1_2(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Un individuo quere investir o seu capital nun banco e desexa saber cantos cartos aforrará despois de tres meses, se o banco paga a razón do 2% mensual';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Capital <input id="varA" type="text"/>' +
        '    <button type="button" onClick="resolver_1_2(varA);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_2(varA) {
	var capital = parseFloat(varA.value);
    var xuro = 0.02;
    var total = capital * (1 + xuro);
    total = total * (1 + xuro);
    total = total * (1 + xuro);
    var aforro = total - capital;
	resultado.textContent = aforro.toFixed(2);
}

function exercicio_1_3(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Unha tenda ofrece un desconto do 15% sobre o total da compra, e un cliente desexa saber canto deberá pagar finalmente pola súa compra';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Total da compra <input id="varA" type="text"/>' +
        '    <button type="button" onClick="resolver_1_3(varA);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_3(varA) {
	var desconto = 0.15;
    var prezo = parseFloat(varA.value);
    prezo *= (1 - desconto);
	resultado.textContent = prezo.toFixed(2);
}

function exercicio_1_4(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Porcentaxe de homes e porcentaxe de mulleres que hai en clase nun momento determinado';
    datos.innerHTML = 
        '<form id="form1">' +
        '    homes <input id="varA" type="text"/>' +
        '    mulleres <input id="varB" type="text"/>' +        
        '    <button type="button" onClick="resolver_1_4(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_4(varA,varB) {
    var homes = parseInt(varA.value);
    var mulleres = parseInt(varB.value);
    var total = homes + mulleres;
    var porcentaxeHomes = (homes / total) * 100;
    var porcentaxeMulleres = (mulleres / total) * 100;    
    var texto = '% de homes = ' + porcentaxeHomes.toFixed(2) + '<br /> % de mulleres = ' + porcentaxeMulleres.toFixed(2);
    resultado.innerHTML = texto;
}

function exercicio_1_5(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Dada unha cantidade en euros, obter a equivalencia en pesetas e en dólares';
    datos.innerHTML = 
        '<form id="form1">' +
        '    euros <input id="varA" type="text"/>' +
        '    dólares <input id="varB" type="text"/>' +        
        '    <button type="button" onClick="resolver_1_5(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_5(varA,varB) {
    var euros = parseFloat(varA.value);
    var dolares = parseFloat(varB.value);
    const CAMBIO_EURO_PESETA = 166.386;
    var pesetas = euros * CAMBIO_EURO_PESETA;
    dolares  = euros * dolares;    
    var texto = 'Dólares = ' + dolares.toFixed(2) + '<br /> Pesetas = ' + pesetas.toFixed(2);
    resultado.innerHTML = texto;
}

function exercicio_1_6(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Calcular o numero de pulsacións que ten unha persoa por cada dez segundos de exercicio se a fórmula é numeroDePulsacions = (220-idade)/6';
    datos.innerHTML = 
        '<form id="form1">' +
        '    idade <input id="varA" type="text"/>' +
        '    <button type="button" onClick="resolver_1_6(varA);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_6(varA) {
    var idade = parseInt(varA.value);
    var numeroDePulsacions = (220 - idade) / 6;
    var texto = 'Número de pulsacións = ' + numeroDePulsacions.toFixed(0);
    resultado.innerHTML = texto;
}

function exercicio_1_7(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Dados dous números, calcula a división do primeiro entre o segundo e imprímea por pantalla';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Introducir o valor do dividendo <input id="varA" type="text"/>' +
        '    Introducir o valor do divisor <input id="varB" type="text"/>' +
        '    <button type="button" onClick="resolver_1_7(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_7(varA,varB) {
    var dividendo = parseFloat(varA.value);
    var divisor = parseFloat(varB.value);
    var resultadoDivision = (dividendo / divisor);
    resultado.textContent = dividendo + " / " + divisor + " = " + resultadoDivision.toFixed(2);
}

function exercicio_1_8(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Un vendedor recibe o soldo base máis un 10% extra de comisión polas súas vendas; o vendedor quere saber cantos cartos obterá no concepto de comisións polas tres vendas que realizou no mes pasado e o total que recibirá no mes. Para obter o resultado final pódese considerar que o seu soldo base é de 1000 euros e que as vendas que realizou foron de 1200, 350 e 5600 euros';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Soldo <input id="varA" type="text"/>' +
        '    Venda 1 <input id="varB" type="text"/>' +
        '    Venda 2 <input id="varC" type="text"/>' +
        '    Venda 3 <input id="varD" type="text"/>' +        
        '    <button type="button" onClick="resolver_1_8(varA,varB,varC,varD);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_8(varA,varB,varC,varD) {
    var soldo = parseFloat(varA.value);
    var venda1 = parseFloat(varB.value);
    var venda2 = parseFloat(varC.value);
    var venda3 = parseFloat(varD.value);
    var comision = 0.1 * (venda1 + venda2 + venda3);
    var total = comision + soldo;
    var texto = "Comisións = " + comision.toFixed(2) + "<br/> Soldo total = " + total.toFixed(2);
    resultado.innerHTML = texto;
}

function exercicio_1_9(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Escribir un programa que lea os 3 coeficientes reais a, b, c dun polinomio de segundo grao e que determine as súas raíces reais';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Coeficiente A <input id="varA" type="text"/>' +
        '    Coeficiente B <input id="varB" type="text"/>' +
        '    Coeficiente C <input id="varC" type="text"/>' +
        '    <button type="button" onClick="resolver_1_9(varA,varB,varC);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_9(varA,varB,varC) {
    var a = parseFloat(varA.value);
    var b = parseFloat(varB.value);
    var c = parseFloat(varC.value);
    var solucion1 = (-b + (Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);
    var solucion2 = (-b - (Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a);    
    var texto = "Solución 1 = " + solucion1 + "<br/> Solución 2 = " + solucion2;
    resultado.innerHTML = texto;
}

function exercicio_1_10(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Escribir un programa que pida unha temperatura en graos Fahrenheit e calcular e amosar o seu equivalente en graos Celsius, ambos admitindo dous decimais';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Introduza os graos Fahrenheit <input id="varA" type="text"/>' +
        '    <button type="button" onClick="resolver_1_10(varA);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_10(varA) {
    var fahrenheit = parseFloat(varA.value);
    var celsius = ((fahrenheit - 32) * (5/9));
    var texto = fahrenheit + " graos fahrenheit son equivalentes a " + celsius.toFixed(2) + " graos celsius";
    resultado.innerHTML = texto;
}

function exercicio_1_11(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Escribir un programa que obteña a equivalencia en polgadas, pés e millas dunha cantidade introducida en metros';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Metros <input id="varA" type="text"/>' +
        '    <button type="button" onClick="resolver_1_11(varA);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_11(varA) {
    var metros = parseFloat(varA.value);
    var polgadas = metros * 39.37;
    var pes = metros * 3.2808;
    var millas = metros * 0.00062137;
    var texto = metros + " metros son equivalentes a " + polgadas.toFixed(2) + " polgadas ou " + pes.toFixed(2) + " pés ou " + millas.toFixed(2) + " millas";
    resultado.innerHTML = texto;
}

function exercicio_1_12(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Escribir un programa que obteña o resultado da operación (a-b)(a+b) logo de introducir os datos correspondentes';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Variable a <input id="varA" type="text"/>' +
        '    Variable b <input id="varB" type="text"/>' +        '    <button type="button" onClick="resolver_1_12(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_12(varA,varB) {
    var varA = parseFloat(varA.value);
    var varB = parseFloat(varB.value);
    var operacion = (varA - varB) * (varA + varB);
    resultado.innerHTML = operacion;
}

function exercicio_1_13(opcion) {
	opcionSubmenu_1(opcion);
    enunciado.textContent = 'Dous atletas percorren a mesma distancia e rexístranse os seus tempos en segundos. Desexamos saber o tempo total utilizado por ambos atletas en horas, minutos e segundos';
    datos.innerHTML = 
        '<form id="form1">' +
        '    Tempo en segundos do 1º atleta <input id="varA" type="text"/>' +
        '    Tempo en segundos do 2º atleta <input id="varB" type="text"/>' +        '    <button type="button" onClick="resolver_1_13(varA,varB);">Premer</button>' +
        '</form>';
    resultado.textContent = '';
}

function resolver_1_13(varA,varB) {
    var varA = parseFloat(varA.value);
    var varB = parseFloat(varB.value);
    var tempoTotal = varA + varB;
    var horas = tempoTotal / 3600;
    var restoHoras = tempoTotal % 3600;
    var minutos = restoHoras / 60;console.log(minutos)
    var segundos = restoHoras % 60;
    resultado.innerHTML = horas.toFixed(0) + ":" + minutos.toFixed(0) + ":" + segundos.toFixed(2);
}

function exercicio_1_14(opcion){
	opcionSubmenu_1(opcion);
	enunciado.textContent = 'Unha persoa desexa saber cales son os seus parámetros físicos para saber se debería facer dieta. Quere saber o seu índice de masa corporal, a relación cintura/altura e o número de calorías diarias a consumir. Recolle os datos necesarios e amosa por pantalla unha táboa cos cálculos realizados. Para simplificar cálculos, e tendo en conta que non podedes usar máis que asignacións e operacións, non fai falla saber se é un home ou unha muller a que o quere saber. Pódese empregar a fórmula 10*peso + 6.25*altura - 5*edad para calcular o número de calorías a consumir diariamente';
	datos.innerHTML = 
		'<form id="form1">' +			
			'<p><label for="peso">Peso: </label><input id="peso" type="text"/><span class="label"> kilogramos</span></p>' +
			'<p><label for="estatura">Estatura: </label><input id="estatura" type="text"/><span class="label"> centímetros</span></p>' +
			'<p><label for="idade">Idade: </label><input id="idade" type="text"/><span class="label"> anos</span></p>' +             
			'<p><label for="perimetro">Perímetro da cintura: </label><input id="perimetro" type="text"/><span class="label"> centímetros</span></p>' +                
			'<p><button onclick="resolver_1_14(peso.value,estatura.value,idade.value,perimetro.value);" type="button">Calcular</button></p>' +
		'</form>';
	resultado.textContent = '';
}

function resolver_1_14(peso,estatura,idade,perimetro) {
	var peso = parseFloat(peso);
	var estatura = parseFloat(estatura);
	var idade = parseInt(idade);
	var perimetro = parseFloat(perimetro);
	
	var imc = peso / Math.pow(estatura / 100,2);
	var cintura = perimetro / estatura;
	var calorias = (10 * peso) + (6.25 * estatura) - (5 * idade);
	
	resultado.innerHTML =
		'<table border="1">' +
			'<tr><th>IMC</th><th>Relación cintura/estatura</th><th>Calorías diarias</th></tr>' +
			'<tr><td>' + imc.toFixed(2) + '</td><td>' + cintura.toFixed(2) + '</td><td>' + calorias.toFixed(2) + '</td></tr>' + 
		'</table>';	
}

function exercicio_1_15(opcion){
	opcionSubmenu_1(opcion);
	enunciado.innerHTML = '<p>Dado un número natural de catro díxitos (non fai falla comprobar que ten catro díxitos) indicar cantos millares, centenas, decenas e unidades ten.</p><p>EXEMPLO:</p><code>1234</code><br /><code>O número introducido ten 1 millares, 2 centenas, 3 decenas e 4 unidades</code><br /><code>27</code><br /><code>O número introducido ten 0 millares, 0 centenas, 2 decenas e 7 unidades</code>';
	datos.innerHTML = 
		'<form id="form1">' +			
			'<p><label>Número: </label><input id="numero" type="text"/></p>' +
			'<p><button onclick="resolver_1_15(numero.value);" type="button">Calcular</button></p>' +
		'</form>';
	resultado.textContent = '';
}

function resolver_1_15(numero) {
	var numero = parseInt(numero);

	var unidades = numero % 10;
	numero = Math.floor(numero / 10);
	var decenas = numero % 10;
	numero = Math.floor(numero / 10);
	var centenas = numero % 10;
	var millares = Math.floor(numero / 10);
		
	resultado.innerHTML = 'O número introducido ten ' + millares + ' millares, ' + centenas + ' centenas, ' + decenas + ' decenas e ' + unidades + ' unidades';
}

function exercicio_1_16(opcion){
	opcionSubmenu_1(opcion);
	enunciado.innerHTML = '<p>Calcular a incidencia acumulada e a evolución do número reprodutivo básico (R<sub>0</sub>) na comunidade galega coñecendo os seguintes datos:</p><pre><table border="0" style="width: 400px; height: 100px;"><tr><td></td><td>ONTE</td><td>HOXE</td></tr><tr><td>Positivos PCR diarios</td><td>211</td><td>285</td></tr><tr><td>Positivos PCR nos últimos 14 días</td><td>2822</td><td>2915</td></tr><tr><td>Casos activos</td><td>4068</td><td>4083</td></tr></table><br><p><strong>NOTA</strong><br>A comunidade galega ten aproximadamente 2.700.000 habitantes<br />A incidencia acumulada é o número de positivos nos últimos 14 días<br />O número reprodutivo básico é o número de positivos PCR diarios dividido entre os casos activos do día anterior<br>Os dous valores calcúlanse por cada 100.000 habitantes<br /><br /><strong>EXEMPLO</strong><br />Cos datos aportados o resultado sería:<br />IA = 108<br />R0 = 1.89</p></pre>';
	datos.innerHTML = 
		'<form id="form1">' +
			'<p>Positivos PCR diarios onte: <input id="PCRDiarioOnte"/></p>' +
			'<p>Positivos PCR nos últimos 14 días onte: <input id="PCR14DiasOnte"/></p>' +
			'<p>Casos activos onte: <input id="casosActivosOnte"/></p>' +
			'<p>Positivos PCR diarios hoxe: <input id="PCRDiarioHoxe"/></p>' +
			'<p>Positivos PCR nos últimos 14 días hoxe: <input id="PCR14DiasHoxe"/></p>' +
			'<p>Casos activos hoxe: <input id="casosActivosHoxe"/></p>' +
			'<p><button type="button" onclick="resolver_1_16(PCRDiarioOnte.value,PCR14DiasOnte.value,casosActivosOnte.value,PCRDiarioHoxe.value,PCR14DiasHoxe.value,casosActivosHoxe.value)">Calcular</button></p>' +
		"</form>";;
	resultado.textContent = '';
}

function resolver_1_16(PCRDiarioOnte,PCR14DiasOnte,casosActivosOnte,PCRDiarioHoxe,PCR14DiasHoxe,casosActivosHoxe){
	const poboacionGaliza = 2700000;
	const por100000 = poboacionGaliza / 100000;
	var IA = PCR14DiasHoxe / por100000;
	var R0 = PCRDiarioHoxe / casosActivosOnte * por100000;
	resultado.innerHTML = '<p>IA = ' + IA.toFixed(0) + '</p><p>R<sub>0</sub> = ' + R0.toFixed(2);	
}
