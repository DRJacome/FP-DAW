/*
Implementar varias clases de manera que haya dos niveles de herencia.<br>
Las clases de los extremos no permitirán heredar.<br>
La clase raíz no permitirá crear objetos de esta.<br>
Los atributos, en todas, deben permitir su consulta,<br>
pero no su modificación.<br>
Debe dotárseles de persistencia.<br>
Cada clase (menos la raíz) debe llevar cuenta del número de<br>
objetos creados, que ha de poder ser consultado sin la necesidad<br>
de utilizar un objeto de dicha clase.
 */
package examen10herencias;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public abstract class ClaseA implements Serializable {

    protected final int atrA;

    public ClaseA(int atrA) {
        this.atrA = atrA;
    }

    /**
     *
     * @return the AtrA
     */
    public int getAtrA() {
        return atrA;
    }
}
