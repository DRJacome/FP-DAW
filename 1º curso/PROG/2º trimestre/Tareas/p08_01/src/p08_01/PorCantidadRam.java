/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08_01;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class PorCantidadRam implements Comparator<WorkStation> {

    @Override
    public int compare(WorkStation o1, WorkStation o2) {
        return o1.getOrdenador().getRam() - o2.getOrdenador().getRam();
    }

}
