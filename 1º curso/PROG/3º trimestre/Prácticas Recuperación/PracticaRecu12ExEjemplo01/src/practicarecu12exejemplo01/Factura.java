/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecu12exejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacod
 */
public class Factura {

    private int numeroFactura;
    private String fechaEmision;
    private int importeTotal;
    private String direccionFacturacion;
    private String dniCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private List<LineaDetalle> lineaDetalle = new ArrayList();

    public Factura() {
    }

    public Factura(int numeroFactura, String fechaEmision, int importeTotal,
            String direccionFacturacion, String dniCliente, String nombreCliente, String apellidosCliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.importeTotal = importeTotal;
        this.direccionFacturacion = direccionFacturacion;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura
                + ", fechaEmision=" + fechaEmision
                + ", importeTotal=" + importeTotal
                + ", direccionFacturacion=" + direccionFacturacion
                + ", dniCliente=" + dniCliente
                + ", nombreCliente=" + nombreCliente
                + ", apellidosCliente=" + apellidosCliente
                + ", lineaDetalle=" + lineaDetalle + '}';
    }

    /**
     * @return the numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(int numeroFactura) {
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
    public int getImporteTotal() {
        return importeTotal;
    }

    /**
     * @param importeTotal the importeTotal to set
     */
    public void setImporteTotal(int importeTotal) {
        this.importeTotal = importeTotal;
    }

    /**
     * @return the direccionFacturacion
     */
    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    /**
     * @param direccionFacturacion the direccionFacturacion to set
     */
    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
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
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the apellidosCliente
     */
    public String getApellidosCliente() {
        return apellidosCliente;
    }

    /**
     * @param apellidosCliente the apellidosCliente to set
     */
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    /**
     * @return the lineaDetalle
     */
    public List<LineaDetalle> getLineaDetalle() {
        return lineaDetalle;
    }

    /**
     * @param lineaDetalle the lineaDetalle to set
     */
    public void setLineaDetalle(List<LineaDetalle> lineaDetalle) {
        this.lineaDetalle = lineaDetalle;
    }
}
