/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecu12exejemplo01;

/**
 *
 * @author jacod
 */
public class LineaDetalle {

    private int codigoProducto;
    private String descripcion;
    private double precioUnitario;
    private int unidades;
    private double precio;
    private double iva;
    private double total;

    public LineaDetalle() {
    }

    public LineaDetalle(int codigoProducto, String descripcion, double precioUnitario, int unidades, double iva) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
        this.iva = iva;
        this.precio = precioUnitario * unidades;
        this.total = precio + (precio * iva / 100);
    }

    @Override
    public String toString() {
        return "LineaDetalle{" + "codigoProducto=" + codigoProducto
                + ", descripcion=" + descripcion
                + ", precioUnitario=" + precioUnitario
                + ", unidades=" + unidades
                + ", precio=" + precio
                + ", iva=" + iva
                + ", total=" + total + '}';
    }

    /**
     * @return the codigoProducto
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

}
