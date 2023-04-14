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
public class Teclado {

    private String tipo;
    private boolean cable;

    public Teclado(String tipo, boolean cable) {
        this.tipo = tipo;
        this.cable = cable;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cable
     */
    public boolean isCable() {
        return cable;
    }

    /**
     * @param cable the cable to set
     */
    public void setCable(boolean cable) {
        this.cable = cable;
    }

    @Override
    public String toString() {
        return "Teclado {"
                + "tipo: " + getTipo()
                + ", cable: " + isCable() + '}';
    }
}
