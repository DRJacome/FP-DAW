/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p07_01;

/**
 *
 * @author alumno
 */
public class WorkStation implements Comparable<WorkStation> {

    private Ordenador ordenador;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;

    public WorkStation(Ordenador ordenador, Monitor monitor) {
        this.ordenador = ordenador;
        this.monitor = monitor;
    }

    public WorkStation(Ordenador ordenador, Monitor monitor, Raton raton, Teclado teclado) {
        this.ordenador = ordenador;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    /**
     * @return the ordenador
     */
    public Ordenador getOrdenador() {
        return ordenador;
    }

    /**
     * @param ordenador the ordenador to set
     */
    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the raton
     */
    public Raton getRaton() {
        return raton;
    }

    /**
     * @param raton the raton to set
     */
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    /**
     * @return the teclado
     */
    public Teclado getTeclado() {
        return teclado;
    }

    /**
     * @param teclado the teclado to set
     */
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "WorkStation {"
                + " ordenador: " + ordenador
                + ",\n monitor = " + monitor
                + ",\n raton = " + raton
                + ",\n teclado = " + teclado + '}';
    }

    /**
     *
     * @param o
     * @return menor que 0 si el primero es menor <br>
     * mayor que 1 si el primero es mayor igual a cero si son iguales.
     */
    @Override
    public int compareTo(WorkStation o) {
        return Double.compare(this.monitor.getTamanho(), o.getMonitor().getTamanho());
    }

}
