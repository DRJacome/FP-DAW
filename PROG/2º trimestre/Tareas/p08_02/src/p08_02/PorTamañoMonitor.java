/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08_02;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class PorTamañoMonitor implements Comparator<WorkStation> {

    @Override
    public int compare(WorkStation o1, WorkStation o2) {
        return Double.compare(o1.getMonitor().getTamanho(), (o2.getMonitor().getTamanho()));
    }

}
