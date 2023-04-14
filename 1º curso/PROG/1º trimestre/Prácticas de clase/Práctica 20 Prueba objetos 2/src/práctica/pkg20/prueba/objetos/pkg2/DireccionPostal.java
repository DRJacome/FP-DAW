/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg20.prueba.objetos.pkg2;

/**
 *
 * @author alumno
 */
public class DireccionPostal {

    String cp;
    String calle;
    int numero;
    String poblacion;
    String provincia;

    public DireccionPostal() {
    }

    public DireccionPostal(String cp, String calle, int numero,
            String poblacion, String provincia) {
        this.cp = cp;
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Dirección postal: " + "\nCP = " + cp + " \ncalle = " + calle
                + " \nnumero = " + numero + " \npoblacion = " + poblacion
                + " \nprovincia = " + provincia;
    }

}
