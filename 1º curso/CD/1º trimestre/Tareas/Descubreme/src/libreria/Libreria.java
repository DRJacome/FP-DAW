package libreria;

/**
 * @author Jose
 *
 */
public class Libreria {

    public static boolean funcionDesconocida(String cadena) {
        cadena = auxiliar(cadena);
        int l = cadena.length();
        for (int i = 0; i < l / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(l - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static String auxiliar(String cadena) {
        return (cadena.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", ""));
    }

    //Prueba de mejora de código.
    public static boolean funcionDesconocidaMejorada(String cadena) {
        cadena = auxiliarMejorada(cadena);
        int l = cadena.length();
        for (int i = 0; i < l / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(l - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String auxiliarMejorada(String cadena) {
        return (cadena.toUpperCase()
                .replace("Á", "A")
                .replace("É", "E")
                .replace("Í", "I")
                .replace("Ó", "O")
                .replace("Ú", "U")
                .replace(" ", "\n"));
    }
}
