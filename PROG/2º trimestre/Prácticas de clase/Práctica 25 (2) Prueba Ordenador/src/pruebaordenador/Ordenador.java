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
public class Ordenador {

    private int ram;
    private String grafica;
    private String procesador;

    public Ordenador() {
    }

    public Ordenador(int ram, String grafica, String procesador) {
        this.ram = ram;
        this.grafica = grafica;
        this.procesador = procesador;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the grafica
     */
    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Ordenador {" + "RAM: " + ram
                + ", gráfica : " + grafica
                + ", procesador: " + procesador + '}';
    }

}
