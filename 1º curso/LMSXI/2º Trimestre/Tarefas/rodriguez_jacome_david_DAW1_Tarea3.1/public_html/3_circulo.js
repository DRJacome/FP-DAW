
do {
    var radio = prompt("Introduce un número: ");
        if (isNaN(radio) || radio <=0)      
                alert ("ERROR! " + radio + " no es un valor numérico.");
            
  //isNaN funciona como booleano de Java.
} while (isNaN(radio) || radio <=0);

alert(Math.PI * Math.pow(parseFloat(radio),2));