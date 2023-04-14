/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaordenador;

/**
 *
 * @author alumno
 */
public class Portatil extends WorkStation {

    int bateria;

    public Portatil(int bateria, Ordenador ordenador, Monitor monitor, Raton raton, Teclado teclado) {
        super(ordenador, monitor, raton, teclado);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Portatil {" + super.toString()
                + "bateria: " + bateria + '}';
    }

}
