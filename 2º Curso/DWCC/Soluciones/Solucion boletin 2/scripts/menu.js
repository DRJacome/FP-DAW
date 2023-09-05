function cargarMenu() {
    menu.innerHTML = 
        '<div id="practica1" class="menu" onClick="submenu1();">Práctica 1</div>' +
        '<div id="practica2" class="menu" onClick="submenu2();">Práctica 2</div>'
}

function submenu1() {
    inicializarEstetica(1);
    
    submenu.innerHTML =
        "<div>" +
        "    <div id='exercicio1' class='submenu' onClick='exercicio_1_1(1);'>Exercicio 1</div>" +
        "    <div id='exercicio2' class='submenu' onClick='exercicio_1_2(2);'>Exercicio 2</div>" +
        "    <div id='exercicio3' class='submenu' onClick='exercicio_1_3(3);'>Exercicio 3</div>" +
        "    <div id='exercicio4' class='submenu' onClick='exercicio_1_4(4);'>Exercicio 4</div>" +   
        "    <div id='exercicio5' class='submenu' onClick='exercicio_1_5(5);'>Exercicio 5</div>" +   
        "    <div id='exercicio6' class='submenu' onClick='exercicio_1_6(6);'>Exercicio 6</div>" +   
        "    <div id='exercicio7' class='submenu' onClick='exercicio_1_7(7);'>Exercicio 7</div>" +
        "    <div id='exercicio8' class='submenu' onClick='exercicio_1_8(8);'>Exercicio 8</div>" +
        "    <div id='exercicio9' class='submenu' onClick='exercicio_1_9(9);'>Exercicio 9</div>" +   
        "    <div id='exercicio10' class='submenu' onClick='exercicio_1_10(10);'>Exercicio 10</div>" +
        "    <div id='exercicio11' class='submenu' onClick='exercicio_1_11(11);'>Exercicio 11</div>" + 
        "    <div id='exercicio12' class='submenu' onClick='exercicio_1_12(12);'>Exercicio 12</div>" + 
        "    <div id='exercicio13' class='submenu' onClick='exercicio_1_13(13);'>Exercicio 13</div>" + 
        "    <div id='exercicio14' class='submenu' onClick='exercicio_1_14(14);'>Exercicio 14</div>" + 
        "    <div id='exercicio15' class='submenu' onClick='exercicio_1_15(15);'>Exercicio 15</div>" + 
        "    <div id='exercicio16' class='submenu' onClick='exercicio_1_16(16);'>Exercicio 16</div>" + 
        "</div>"
}
function submenu2() {
    inicializarEstetica(2);

    submenu.innerHTML =
        "<div>" +
        "    <div id='exercicio1' class='submenu' onClick='exercicio_2_1(1);'>Exercicio 1</div>" +
        "    <div id='exercicio2' class='submenu' onClick='exercicio_2_2(2);'>Exercicio 2</div>" +
        "    <div id='exercicio3' class='submenu' onClick='exercicio_2_3(3);'>Exercicio 3</div>" +
        "    <div id='exercicio4' class='submenu' onClick='exercicio_2_4(4);'>Exercicio 4</div>" +   
        "    <div id='exercicio5' class='submenu' onClick='exercicio_2_5(5);'>Exercicio 5</div>" +   
        "    <div id='exercicio6' class='submenu' onClick='exercicio_2_6(6);'>Exercicio 6</div>" +   
        "    <div id='exercicio7' class='submenu' onClick='exercicio_2_7(7);'>Exercicio 7</div>" +
        "    <div id='exercicio8' class='submenu' onClick='exercicio_2_8(8);'>Exercicio 8</div>" +
        "    <div id='exercicio9' class='submenu' onClick='exercicio_2_9(9);'>Exercicio 9</div>" +   
        "    <div id='exercicio10' class='submenu' onClick='exercicio_2_10(10);'>Exercicio 10</div>" +
        "    <div id='exercicio11' class='submenu' onClick='exercicio_2_11(11);'>Exercicio 11</div>" + 
        "    <div id='exercicio12' class='submenu' onClick='exercicio_2_12(12);'>Exercicio 12</div>" + 
        "    <div id='exercicio13' class='submenu' onClick='exercicio_2_13(13);'>Exercicio 13</div>" + 
        "    <div id='exercicio14' class='submenu' onClick='exercicio_2_14(14);'>Exercicio 14</div>" + 
        "    <div id='exercicio15' class='submenu' onClick='exercicio_2_15(15);'>Exercicio 15</div>" +
        "    <div id='exercicio16' class='submenu' onClick='exercicio_2_16(16);'>Exercicio 16</div>" + 		
        "    <div id='exercicio17' class='submenu' onClick='exercicio_2_17(17);'>Exercicio 17</div>" + 		
        "    <div id='exercicio18' class='submenu' onClick='exercicio_2_18(18);'>Exercicio 18</div>" + 		
        "</div>"
}

function inicializarEstetica(opcion) {
	practica1.classList.remove("activo");
	practica2.classList.remove("activo");
	switch(opcion) {
		case 1: practica1.classList.add("activo"); break;
		case 2: practica2.classList.add("activo"); break;
		default: break;
	}	
    submenu.innerHTML = '';
    enunciado.innerHTML = '';
    datos.innerHTML = '';
    resultado.innerHTML = '';    
}

