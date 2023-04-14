

var empresa1 = new Array(91827364, 22993388, 98765432);
var empresa2 = new Array(56782345, 65748392, 87564312);
var union = new Array(empresa1.length + empresa2.length);
var orden;

for (var i = 0; i < empresa1.length; i++) {
    union[i] = empresa1[i];
}
for (var i = 0; i < empresa2.length; i++) {
    union[i + empresa1.length] = empresa2[i];
}
for (i = 1; i < union.length; i++) {
    orden = union[i];
    var j = i - 1;
    while ((j >= 0) && (orden < union[j])) {
        union[j + 1] = union[j];
        j--;
    }
    union[j + 1] = orden;
}
document.write("DNI: <br/>");

for (i = 0; i < union.length; i++) {
    document.write((i + 1) + " --> " + union[i] + "<br/>");
}