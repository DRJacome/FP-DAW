

var arrayLista = new Array(4, 12, 8, 6, 43, 9, 3, 12, 333, 1);

document.write("Lista original: " + arrayLista + "<br/>");

//1. For para recorrer el array.
//2. var mayor para guardar el valor de la posición[i].
//3. var j para comparar el valor de la posición[i] con la anterior.
//4. While = mientras j sea mayor o igual que 0 YY que mayor sea menor
//      que el array en la posición[j],
//5. Array en la posición[0] + 1 = array en la posición j vale 1.
//6. Decrementar -1.
//7. Array en la posición[0] + 1 = 4;

/*1*/for (var i = 1; i < arrayLista.length; i++) { // --> i vale 1;
    /*2*/  var mayor = arrayLista[i];
    /*3*/    var j = i - 1; //--> i vale(1)-1; j = 0;
    /*4*/    while ((j >= 0) && (mayor < arrayLista[j])) {
        /*5*/        arrayLista[j + 1] = arrayLista[j];
        /*6*/        j--;
    }
    /*7*/    arrayLista[j + 1] = mayor;
}
document.write("Lista ordenada numéricamente: " + arrayLista + "<br/>");