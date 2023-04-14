/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaOrdenarListaPorCriterio;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class PorPeso implements Comparator<NaveEspacial> {

    @Override
    public int compare(NaveEspacial o1, NaveEspacial o2) {
        return Double.compare(o1.getPeso(), o2.getPeso());
    }

}
