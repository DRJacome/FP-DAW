
// Con funciones:

/*var arrayLista = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
 
 document.write("Lista original: " + arrayLista+ "<br/>");
 
 num = prompt("Introduce un elemento para introducirlo en la lista: ");
 
 arrayLista.push(num);
 
 document.write("Lista extendida: " + arrayLista+ "<br/>");*/

// Sin funciones:

var arrayLista = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

document.write("Lista original: " + arrayLista + "<br/>");

num = prompt("Introduce un elemento para introducirlo en la lista: ");

arrayLista[15] = num;

document.write("Lista actualizada: " + arrayLista);