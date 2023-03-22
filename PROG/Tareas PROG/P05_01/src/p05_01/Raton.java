/*
Crear una clase Raton que permita modelar un ratón de ordenador.
Debemos tener en cuenta el número de botones, si es o no inalámbrico, gaming y ergonómico,
el tipo de conector que utiliza y su precisión en DPI.

Una vez construido un ratón, los únicos datos modificables serán los DPI
(que han de estar dentro de un rango que se predetermina al construir el ratón) y la carga de la batería (en caso de tenerla),
que indicaremos como porcentaje y evitaremos sobrecargas.

Nuestra empresa fabrica ratones bajo tres marcas, que son fijas para todos los ratones (en la clase),
pero cada uno de ellos irá etiquetado con una única de ellas.

Debemos llevar la cuenta de los ratones construidos internamente (en la propia clase)

A la hora de pedir los datos de los componentes al igual que a la hora de mostrarlos,
no se deben utilizar dato de tipo boolean, esto es: no escribir ni mostrar true o false.
 */
package p05_01;

/**
 *
 * @author jacod
 */
public class Raton {

    private final int numeroBotones;
    private final boolean inalambrico;
    private final boolean gaming;
    private final boolean ergonomico;
    private final String tipoConecgtor;
    private double precision;
    private final boolean bateria;
    private int porcentajeCarga;
    private final String[] marcas = {"Logitech", "Acer", "Microsoft"};
    private final int miMarca;

    public Raton(int numeroBotones, boolean inalambrico, boolean gaming, boolean ergonomico,
            String tipoConecgtor, double precision, boolean bateria, int porcentajeCarga, int miMarca) {
        this.numeroBotones = numeroBotones;
        this.inalambrico = inalambrico;
        this.gaming = gaming;
        this.ergonomico = ergonomico;
        this.tipoConecgtor = tipoConecgtor;
        this.precision = precision;
        this.bateria = bateria;
        if (bateria) {
            this.porcentajeCarga = porcentajeCarga;
        }
        this.miMarca = miMarca;
    }

    /**
     * @return the numeroBotones
     */
    public int getNumeroBotones() {
        return numeroBotones;
    }

    /**
     * @return the inalambrico
     */
    public boolean isInalambrico() {
        return inalambrico;
    }

    /**
     * @return the gaming
     */
    public boolean isGaming() {
        return gaming;
    }

    /**
     * @return the ergonomico
     */
    public boolean isErgonomico() {
        return ergonomico;
    }

    /**
     * @return the tipoConecgtor
     */
    public String getTipoConecgtor() {
        return tipoConecgtor;
    }

    /**
     * @return the precision
     */
    public double getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(double precision) {
        this.precision = precision;
    }

    /**
     * @return the bateria
     */
    public boolean isBateria() {
        return bateria;
    }

    /**
     * @return the porcentajeCarga
     */
    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }

    /**
     * @param porcentajeCarga the porcentajeCarga to set
     */
    public void setPorcentajeCarga(int porcentajeCarga) {
        if (bateria) {
            this.porcentajeCarga = porcentajeCarga;
        }
    }

    /**
     * @return the miMarca
     */
    public int getMiMarca() {
        return miMarca;
    }

    @Override
    public String toString() {
        return "Raton{" + "numeroBotones=" + numeroBotones + ", "
                + "inalambrico=" + (inalambrico ? " Si " : " No ")
                + ", gaming=" + gaming
                + ", ergonomico=" + ergonomico
                + ", tipoConecgtor=" + tipoConecgtor
                + ", precision=" + precision
                + ", bateria=" + bateria
                + ", porcentajeCarga=" + porcentajeCarga + "%, "
                + "Marca=" + marcas[miMarca]
                + ", miMarca=" + miMarca + '}';
    }
}
