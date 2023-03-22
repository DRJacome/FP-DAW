/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg23.modificadores.de.acceso;

/**
 *
 * @author alumno
 */
public final class Clase3 extends Clase2 {

    public Clase3(double PI) {
        super(PI);
    }

    void xxx() {
        d = 15;
        setB(d);
    }
}
