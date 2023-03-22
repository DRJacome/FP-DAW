/*

 */
package ficheros;

import java.io.Serializable;

/**
 *
 * @author Amador Abelleira Gómez
 */
public class LineaDetalle implements Serializable {

    private String codigoProducto;
    private String descripcion;
    private Double precioUnitario;
    private int unidades;
    private Double precio;
    private int iva;
    private Double total;

    public LineaDetalle(String codigoProducto, String descripcion, Double precioUnitario,
            int unidades, int iva) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
        this.unidades = unidades;
        precio = this.precioUnitario * this.unidades;
        total = precio + (precio * iva / 100);

    }

    public LineaDetalle() {
    }

    @Override
    public String toString() {
        return "Código Producto=" + codigoProducto + ", Descripcion=" + descripcion
                + ", Precio Unitario=" + precioUnitario + ", Unidades=" + unidades
                + ", Precio=" + precio + ", %IVA=" + iva + ", Total=" + total;
    }

    /**
     * @return the codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(String codigoProducto) {
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
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(Double precioUnitario) {
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
    public Double getPrecio() {
        return precio;
    }

    /**
     * @return the iva
     */
    public int getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(int iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

}
