

var buzon = new Array(150);

for (var i = 0; i < buzon.length; i++) {
     buzon[i] = 'c';
}

for (i = 1; i < buzon.length; i+=2) {
    buzon[i] = 'a';
}

for (i = 2; i < buzon.length; i++) {
    for (var j = i; j < buzon.length; j+=(i+1)) {
        if (buzon[j] == 'a') {
            buzon[j] = 'c';
        } else {
            buzon[j] = 'a';
        }
    }
}

document.write("Buzones cerrados: <br/>");

for (var i = 0; i < buzon.length; i++) {
    if (buzon[i] == 'c') {
        document.write("Buzón " + i + " " + buzon[i] + "<br/>");
    }
}