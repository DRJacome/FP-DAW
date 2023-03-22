/*

 */
package ficheros;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Amador Abelleira Gómez
 */
public class Factura implements Comparable<Factura>, Serializable {

    private String numeroFactura;
    private String fechaEmision;
    private Double importeTotal;
    private String direccionFaturacion;
    private String dniCliente;
    private ArrayList<LineaDetalle> lineasDetalle;

    /**
     * Criterio de ordenación principal
     *
     * @param o disco con el que vamos a comparar
     * @return <0 0 o >0 dependiendo de si el disco actual es memor igual o
     * mayor al disco con el que se compara
     */
    @Override
    public int compareTo(Factura o) {
        return this.numeroFactura.compareTo(o.numeroFactura);
    }

    public Factura(String numeroFactura, String fechaEmision, Double importeTotal, String direccionFaturacion, String dniCliente, ArrayList<LineaDetalle> lineasDetalle) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.importeTotal = importeTotal;
        this.direccionFaturacion = direccionFaturacion;
        this.dniCliente = dniCliente;
        this.lineasDetalle = lineasDetalle;
    }

    public Factura() {
    }

    // no listamos las línea de detalle por defecto, para hacer más legible el listado
    @Override
    public String toString() {
        return "Número Factura=" + numeroFactura + ", Fecha Emision=" + fechaEmision
                + ", Importe Total=" + importeTotal + ", Direccion Faturacion="
                + direccionFaturacion + ", DNI Cliente=" + dniCliente;
    }

    /**
     * @return the numeroFactura
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the fechaEmision
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the importeTotal
     */
    public Double getImporteTotal() {
        return importeTotal;
    }

    /**
     * @param importeTotal the importeTotal to set
     */
    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    /**
     * @return the direccionFaturacion
     */
    public String getDireccionFaturacion() {
        return direccionFaturacion;
    }

    /**
     * @param direccionFaturacion the direccionFaturacion to set
     */
    public void setDireccionFaturacion(String direccionFaturacion) {
        this.direccionFaturacion = direccionFaturacion;
    }

    /**
     * @return the dniCliente
     */
    public String getDniCliente() {
        return dniCliente;
    }

    /**
     * @param dniCliente the dniCliente to set
     */
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    /**
     * @return the lineasDetalle
     */
    public ArrayList<LineaDetalle> getLineasDetalle() {
        return lineasDetalle;
    }

    /**
     * @param lineasDetalle the lineasDetalle to set
     */
    public void setLineasDetalle(ArrayList<LineaDetalle> lineasDetalle) {
        this.lineasDetalle = lineasDetalle;
    }

}
