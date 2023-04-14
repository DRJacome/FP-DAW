/*
 *
 */
package practicahashsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jacod
 */
public class PracticaHashSetMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Key: nombre, valor: títulos.
        HashMap<String, Integer> equipos = new HashMap<>();

        Set<String> primera = new HashSet<>();
        Set<String> segunda = new HashSet<>();

        primera.add("Lugo");
        primera.add("Pontevedra");
        primera.add("Lalín");
        primera.add("Ulla");

        equipos.put("Lugo", 12);
        equipos.put("Pontevedra", 5);
        equipos.put("Lalín", 7);

        segunda.add("Cangas");
        segunda.add("Ulla");
        segunda.add("Cuntis");
        segunda.add("Lalín");

        equipos.put("Cangas", 25);
        equipos.put("Ulla", 9);
        equipos.put("Cuntis", 32);

        Set<String> copiaPrimera = new HashSet<>(primera);
        Set<String> setAux = new HashSet<>(primera);

        // Unión.
        copiaPrimera.addAll(segunda);

        // Intersección.
        setAux.retainAll(segunda);

        // Diferencia síncrona.
        copiaPrimera.removeAll(setAux);

        for (String string : copiaPrimera) {
            System.out.println(copiaPrimera);
        }
    }
}
