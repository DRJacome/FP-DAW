/*

 */
package ficheros;

import java.util.Comparator;

/**
 *
 * @author Amador Abelleira Gómez
 */
public class OrdenPorImpotte implements Comparator<Factura> {

    @Override
    public int compare(Factura o1, Factura o2) {
        return o1.getImporteTotal().compareTo(o2.getImporteTotal());
    }
}
